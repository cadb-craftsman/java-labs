package com.cice.parking.gestion;

import java.util.ArrayList;

import com.cice.parking.vehiculo.Vehiculo;

public class GestionParking {

	private ArrayList<Vehiculo> listaVehiculos;

	public GestionParking(){
		listaVehiculos = new ArrayList<Vehiculo>();
	}
	
	public void insertar(Vehiculo v) {
		listaVehiculos.add(v);
	}

	public void eliminar(Vehiculo v) {
		for (int i = 0; i < listaVehiculos.size(); i++) {
			if (listaVehiculos.get(i).equals(v.getMatricula())) {
				listaVehiculos.remove(i);
			}
		}
	}

	public void buscar(Vehiculo v) {
		for (int i = 0; i < listaVehiculos.size(); i++) {
			if (listaVehiculos.get(i).equals(v.getMatricula())) {
				System.out.println(v.toString());
			}
		}
	}

	public void listar() {
		for (int i = 0; i < listaVehiculos.size(); i++) {
			System.out.println(listaVehiculos.get(i).toString());
		}
	}

	public ArrayList<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}

}
