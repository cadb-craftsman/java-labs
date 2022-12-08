package com.bookstore.business.interfaz;

import java.util.List;
import com.bookstore.jbeans.JB_Libro;

public interface INegocioLibro {
	
	public List<JB_Libro> buscarLibroAutor(JB_Libro libro);
	public List<JB_Libro> buscarLibro(JB_Libro libro);

}
