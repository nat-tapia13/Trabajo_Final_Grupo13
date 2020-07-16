package ar.edu.unju.fi.tracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.unju.fi.tracking.model.RegistroTracking;

public interface IRegistroTrackingDAO extends JpaRepository<RegistroTracking, Long> {

	//public void guardadDatos();
	
	
}
