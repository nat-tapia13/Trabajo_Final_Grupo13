package ar.edu.unju.fi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import ar.edu.unju.fi.tracking.service.LoginUsuarioServiceImp;

/**
 * Clase que pertenece a la seguridad cuando se logue un usuaurio a la paguina web
 * @author Natalia
 *
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends  WebSecurityConfigurerAdapter{
 
	String[] resources = new    String[]{
    "/include/**" , "/css/**" , "/icons/**" , "/img/**" , "/js/**" , "/layer/**" , "/webjars/**","/"

};

@Autowired
private AuthenticationSuccessHandler autenticacion;
   
@Override  
protected void configure(HttpSecurity http) throws Exception{

 http
  .authorizeRequests()
     .antMatchers(resources).permitAll()
     .antMatchers("/","/home").permitAll()
     .anyRequest().authenticated()
     .and()
   
   .formLogin()
   .loginPage("/loginUser")
   .permitAll()
   .successHandler(autenticacion)
   .failureUrl("/loginUser?error=true")
   .usernameParameter("nombreUsuario")
   .passwordParameter("password")
   .and()

.logout()
 .permitAll()
 .logoutSuccessUrl("/loginUser?logout");

}
//creamos una variable de tipo BCryptPasswordEncoder que permite encriptar una clave ingresada
//por el usuario

BCryptPasswordEncoder  bCrypPasswordEncoder;

@Bean
public BCryptPasswordEncoder  passwordEncoder() {
bCrypPasswordEncoder =  new BCryptPasswordEncoder(8);
return   bCrypPasswordEncoder;

}

@Autowired
LoginUsuarioServiceImp userDetailsService;

@Autowired
public void configureGlobal(AuthenticationManagerBuilder  auth) throws Exception {
 auth. userDetailsService( userDetailsService).passwordEncoder(passwordEncoder());
 
 }

}	
