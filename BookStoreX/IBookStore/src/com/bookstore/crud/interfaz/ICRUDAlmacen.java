/* 
   
 */

package com.bookstore.crud.interfaz;

import java.util.List;
import com.bookstore.jbeans.*;

public interface ICRUDAlmacen {

    public void insertar(JB_Almacen almacen);
    
    public void eliminar(JB_Almacen almacen);

    public List<JB_Almacen> consultar(JB_Almacen almacen);

    public void actualizar(JB_Almacen almacen);

}
