package com.bookstore.crud.interfaz;

import java.util.List;
import com.bookstore.jbeans.JB_Oferta;

public interface ICRUDOferta {
	
   public void insertarOferta(JB_Oferta oferta);
    
    public void eliminarOferta(JB_Oferta oferta);

    public List<JB_Oferta> consultarOferta(JB_Oferta oferta);

    public void actualizarOferta(JB_Oferta oferta);


}
