package ar.edu.unju.fi;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

/**
 * Clase que representa la utenticacion de un usuario en la paguina web
 * @author Natalia
 *
 */
@Component
public class AutenticacionSuccessHandler implements AuthenticationSuccessHandler {

	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

	public void onAuthenticationSucess(HttpServletRequest request, HttpServletResponse response,
		Authentication authentication) throws IOException, ServletException {
		boolean tipoConsultor = false;
		boolean tipoRegistrador = false;
		boolean tipoAbm = false;
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		for (GrantedAuthority grantedAuthority : authorities) {
			if (grantedAuthority.getAuthority().equals("CONSULTOR")) {
				tipoConsultor = true;
				break;
			} else {
				if (grantedAuthority.getAuthority().equals("REGISTRADOR")) {
					tipoRegistrador = true;
					break;
				} else {
					tipoAbm = true;
					break;
				}
			}
		}
		if (tipoRegistrador) {
			redirectStrategy.sendRedirect(request, response, "/registro");
		} else {
			if (tipoConsultor) {
				redirectStrategy.sendRedirect(request, response, "/consultas");
			} else {
				if (tipoAbm) {
					redirectStrategy.sendRedirect(request, response, "/abm");
				} else {
					throw new IllegalStateException();
				}
			}
		}

	}

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		
	}
}
