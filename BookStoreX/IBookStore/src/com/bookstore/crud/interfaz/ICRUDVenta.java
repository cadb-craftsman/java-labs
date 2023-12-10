/* 
   
 */
package com.bookstore.crud.interfaz;

import java.util.*;
import com.bookstore.jbeans.*;

public interface ICRUDVenta {

    public void insertarVenta(JB_Venta venta);

    public void eliminarVenta(JB_Venta venta);

    public List<JB_Venta> consltarVenta(JB_Venta venta);

    public void actualizarVenta(JB_Venta venta);

}
