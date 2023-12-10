package com.cice.supermercado.main;

import javax.swing.JOptionPane;

import com.cice.supermercado.gestion.GestionProducto;
import com.cice.supermercado.menu.Menu;
import com.cice.supermercado.producto.Producto;

public class Main {
		
	public static void main(String[] args) {
		
		int opc = 0;
		Menu menu = new Menu();
		GestionProducto gestion = new GestionProducto();
		
		do {
			opc = menu.mostrarMenu();
			switch (opc) {
			case 1:
				Producto p = menu.mostrarDatosProducto();
				gestion.insertarProducto(p);
				break;
			case 2:
				String codigo = menu.buscarProducto();
				gestion.eliminarProducto(codigo);
				break;
			case 3:
				gestion.listarProductos();
				break;
			case 4:				
				String c = menu.buscarProducto();
				gestion.buscarCantidadProducto(c);
				break;
			case 5:
				gestion.listarAusenciaProducto();
				break;
			default:
				if (opc != 6) {
					JOptionPane.showMessageDialog(null, "Opcion no valida, por favor elija una opción del menu");
				}
				break;
			}
			
		} while (opc != 6);
	}

}
