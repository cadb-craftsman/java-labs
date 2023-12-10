package com.woowrale.personas.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.woowrale.personas.jpa.model.Persona;

public interface PersonaJPADao {
	
	public boolean insertarPersona(Persona p);
	
	public boolean actualizarPersona(Persona p);

	public boolean eliminarPersona(Persona p);
	
	public List<Persona> consultarPersonas();
	
	public List<Persona> consultarPersona(Persona p);

	public EntityManagerFactory getEntityManagerFactory();

	public EntityManager getEntityManager();
}
