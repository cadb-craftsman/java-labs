package com.cice.parking.menu;

import javax.swing.JOptionPane;

import com.cice.parking.herencia.Camion;
import com.cice.parking.herencia.Coche;
import com.cice.parking.herencia.Moto;
import com.cice.parking.vehiculo.Vehiculo;

public class Menu {

	private int contador;

	public Menu() {
		this.contador = 100;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
	public void eliminarContador(int contador){
		this.contador -= contador;		
	}
	
	public int mostrarMenu() {

		int opc = 0;
		try {
			opc = Integer.parseInt(JOptionPane
					.showInputDialog("Seleccione una opción del menu" + "["
							+ this.contador + "] plazas disponibles\n"
							+ "[1] Insertar \n" + "[2] Eliminar \n"
							+ "[3] Listar Datos Vehiculos\n"
							+ "[4] Listar Vehiculos\n" + "[5] Salir\n"));

		} catch (NumberFormatException e) {
			System.err.println(e);
			opc = 0;
		}
		return opc;
	}

	public int elegirTipoVehiculo() {
		int c = 0;
		try {
			c = Integer.parseInt(JOptionPane.showInputDialog("[1] Coche\n"
					+ "[2] Moto\n" + "[3] Camion\n"));
		} catch (NumberFormatException e) {
			c = 0;
			System.err.println(e);
		}
		return c;
	}

	public Vehiculo mostrarCamposVehiculo(){
		int tipo = elegirTipoVehiculo();
		Vehiculo v = null;
		String matricula, marca, modelo, color;
		
		switch(tipo){
		case 1:
			matricula = JOptionPane.showInputDialog("Insertar Matricula del Coche");
			marca = JOptionPane.showInputDialog("Insertar Marca del Coche");
			modelo = JOptionPane.showInputDialog("Insertar Modelo del Coche");
			color = JOptionPane.showInputDialog("Insertar Color del Coche");
			int numeroPuertas  = Integer.parseInt(JOptionPane.showInputDialog("Insertar Numero de Puertas del Coche"));
			v = new Coche(matricula, marca, modelo, color, numeroPuertas);
			break;
		case 2:
			matricula = JOptionPane.showInputDialog("Insertar Matricula de la Moto");
			marca = JOptionPane.showInputDialog("Insertar Marca de la Moto");
			modelo = JOptionPane.showInputDialog("Insertar Modelo de la Moto");
			color = JOptionPane.showInputDialog("Insertar Color de la Moto");
			String s = JOptionPane.showInputDialog("¿Tiene SideCar? [S/N]");
			boolean sideCar = false;
			if (s.equalsIgnoreCase("s")) {
				sideCar = true;
			}
			v = new Moto(matricula, marca, modelo, color, sideCar);			
			break;
		case 3:
			matricula = JOptionPane.showInputDialog("Insertar Matricula del Camion");
			marca = JOptionPane.showInputDialog("Insertar Marca del Camion");
			modelo = JOptionPane.showInputDialog("Insertar Modelo del Camion");
			color = JOptionPane.showInputDialog("Insertar Color del Camion");
			String t = JOptionPane.showInputDialog("¿Tiene Tara el Camion? [S/N]");
			boolean tara = false;
			if (t.equalsIgnoreCase("s")) {
				tara = true;
			}
			v = new Camion(matricula, marca, modelo, color, tara);
			break;
			default:
				JOptionPane.showMessageDialog(null, "Opción no valida, por favor elija una opcion del menu");
				break;
		}		
		return v;
	}
	
}
