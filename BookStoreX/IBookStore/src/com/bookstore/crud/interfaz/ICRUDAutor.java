/* 
   
 */
package com.bookstore.crud.interfaz;

import java.util.*;
import com.bookstore.jbeans.*;

public interface ICRUDAutor {

    public void insertarAutor(JB_Autor autor);
    
    public void eliminarAutor(JB_Autor autor);

    public List<JB_Autor> consultarAutor(JB_Autor autor);

    public void actualizarAutor(JB_Autor autor);

}
