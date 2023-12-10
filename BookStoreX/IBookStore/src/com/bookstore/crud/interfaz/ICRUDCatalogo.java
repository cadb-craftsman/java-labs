/* 
   
 */
package com.bookstore.crud.interfaz;

import java.util.*;
import com.bookstore.jbeans.*;

public interface ICRUDCatalogo {

    public void insertarCatalogo(JB_Catalogo catalogo);

    public void eliminarCatalogo(JB_Catalogo catalogo);

    public List<JB_Catalogo> consultarCatalogo(JB_Catalogo catalogo);

    public void actualizarCatalogo(JB_Catalogo catalogo);

}
