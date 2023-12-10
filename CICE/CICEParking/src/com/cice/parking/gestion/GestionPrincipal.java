package com.cice.parking.gestion;

import javax.swing.JOptionPane;

import com.cice.parking.menu.Menu;
import com.cice.parking.vehiculo.Vehiculo;

public class GestionPrincipal {
	
	public void iniciarPrograma(){
		int opc = 0;
		Vehiculo v = null;
		Menu menu = new Menu();		
		GestionParking gp = new GestionParking();
		
		do {
			opc = menu.mostrarMenu();
			switch(opc){
			case 1:
				v = menu.mostrarCamposVehiculo();
				gp.insertar(v);
				menu.eliminarContador(1);
				break;
			case 2:
				v = menu.mostrarCamposVehiculo();
				gp.eliminar(v);				
				break;
			case 3:
				v = menu.mostrarCamposVehiculo();
				gp.buscar(v);
				break;
			case 4:
				gp.listar();
				break;
			case 5:
				break;
				default:
					if (opc != 5) {
						JOptionPane.showMessageDialog(null, "Opción no valida por favor elije una opción del menu");
					}
					break;			
			}
			
		} while (opc != 5);
	}

}
