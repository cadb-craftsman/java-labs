package com.craftsman.training.perito;

import java.util.ArrayList;

public class PeritoAgenda {

	private ArrayList<Partes> listaPartes;
	
	public PeritoAgenda() {
		super();
		listaPartes = new ArrayList<Partes>();
	}

	public ArrayList<Partes> getListaPartes() {
		return listaPartes;
	}

	public void setListaPartes(ArrayList<Partes> listaPartes) {
		this.listaPartes = listaPartes;
	}
	
	public void insertarParte(Partes p){
		listaPartes.add(p);
	}
	
	public void mostrarPartes(){
		for (int i = 0; i < listaPartes.size(); i++) {
			System.out.println(listaPartes.get(i).toString());
		}
	}
	
	public Partes buscarParte(int codigo){
		for (int i = 0; i < listaPartes.size(); i++) {
			if (listaPartes.get(i).getCodigo() == codigo) {
				return listaPartes.get(i);
			}
		}
		System.out.println("Parte no encontrado");
		return null;
	}
	
	public void eliminarParte(int codigo){
		for (int i = 0; i < listaPartes.size(); i++) {
			if (listaPartes.get(i).getCodigo() == codigo) {
				listaPartes.remove(i);
			}
		}
	}
}
