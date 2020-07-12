package ar.edu.unju.fi.tracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.unju.fi.tracking.model.Localidad;

public interface ILocalidadDAO extends JpaRepository<Localidad, Long>{
/**
	public void guardar(Localidad localidad);
	
	public void modificar(Localidad localidad);
	
	public void eliminar();*/
}
