/* 
   
 */
package com.bookstore.crud.interfaz;

import java.util.*;
import com.bookstore.jbeans.*;

public interface ICRUDLibro {

	public void insertarLibro(JB_Libro libro);

    public void eliminarLibro(JB_Libro libro);

    public List<JB_Libro> consultarLibro(JB_Libro libro);

    public void actualizarLibro(JB_Libro libro);

}
