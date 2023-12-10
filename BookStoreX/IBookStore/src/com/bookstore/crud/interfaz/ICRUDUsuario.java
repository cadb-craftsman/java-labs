/* 
   
 */
package com.bookstore.crud.interfaz;

import java.util.*;
import com.bookstore.jbeans.*;

public interface ICRUDUsuario {

	public void insertarUsuario(JB_Usuario usuario);

    public void eliminarUsuario(JB_Usuario usuario);

    public List<JB_Usuario> consultarUsuario(JB_Usuario usuario);

    public void actualizarUsuario(JB_Usuario usuario);

}
