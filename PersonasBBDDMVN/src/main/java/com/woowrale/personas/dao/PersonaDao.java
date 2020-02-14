package com.woowrale.personas.dao;

import java.util.List;

import com.woowrale.personas.model.Persona;

public interface PersonaDao {
	
	public boolean insertarPersona(Persona p);
	
	public boolean actualizarPersona(Persona pActual, Persona pModificada);

	public boolean eliminarPersona(Persona p);
	
	public List<Persona> consultarPersonas();
	
	public List<Persona> consultarPersona(Persona p);

}
