package com.bookstore.business;

import java.util.List;

import com.bookstore.jbeans.JB_Autor;
import com.bookstore.jbeans.JB_Libro;
import com.bookstore.adapter.interfaz.IFactoryAdapter;
import com.bookstore.business.interfaz.INegocioLibro;

public class INegocioLibroImpl implements INegocioLibro {

	public static String VOID = "";
	
	private IFactoryAdapter factoryAdapter;
	
	public INegocioLibroImpl(){
		super();
	}
	
	public INegocioLibroImpl(IFactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

	@Override
	public List<JB_Libro> buscarLibroAutor(JB_Libro libro) {
		
		List<JB_Libro> librosList = null;
		
		if((libro.getGenerico() != null) && (!libro.getGenerico().equals(VOID))){
			JB_Autor autor = new JB_Autor();
			autor.setGenerico(libro.getGenerico());			
			List<JB_Autor> autoresList = factoryAdapter.getICRUDAutor().consultarAutor(autor);
			if(autoresList != null){
				for(int i = 0; i < autoresList.size(); i++){
					JB_Libro libroBusqueda = new JB_Libro();
					libroBusqueda.setIsbn(autoresList.get(i).getIsbn());
					librosList = buscarLibro(libroBusqueda);
				}
			}
		}
		
		if(librosList == null){
			librosList = buscarLibro(libro);
		}
		
		return librosList;
	}

	@Override
	public List<JB_Libro> buscarLibro(JB_Libro libro) {
		
		List<JB_Libro> librosList = factoryAdapter.getICRUDLibro().consultarLibro(libro);
		
		for (int i = 0; i < librosList.size(); i++) {
			JB_Autor autor = new JB_Autor();
			autor.setIsbn(librosList.get(i).getIsbn());			
			List<JB_Autor> autoresList = factoryAdapter.getICRUDAutor().consultarAutor(autor);		
			if(autoresList != null){
				for (int j = 0; j < autoresList.size(); j++) {
					librosList.get(i).setAutoresList(autoresList.get(j));
				}
			}			
		}

		return librosList;
	}	
}
