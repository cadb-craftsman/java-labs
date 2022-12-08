/* 
   
 */
package com.bookstore.crud.interfaz;

import java.util.*;
import com.bookstore.jbeans.*;

public interface ICRUDCliente {

    public int insertarCliente(JB_Cliente cliente);

    public int eliminarCliente(JB_Cliente cliente);

    public List<JB_Cliente> consultarCliente(JB_Cliente cliente);

    public int actualizarCliente(JB_Cliente cliente);

}
