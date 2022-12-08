package com.craftsman.training.arraylist;

import java.util.ArrayList;

public class ProductoTest {
	
	public static void main(String[] args) {
		
		//Definicion y creacion de 5 objetos tipo Producto
		Producto p1 = new Producto("pan", 6);
		Producto p2 = new Producto("leche", 2);
		Producto p3 = new Producto("manzanas", 5);
		Producto p4 = new Producto("carne", 2);
		Producto p5 = new Producto("pimiento", 3);
		
		//Definir Objeto ArrayList de tipo producto
		ArrayList<Producto> l = new ArrayList<Producto>();

		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);		
		
		//A�adir indicando indice de insercion
		l.add(1, p5);
		
		//A�adir al final de la lista
		l.add(p5);		
		System.out.println("La lista de tiene " + l.size() + " de Elementos");
		
		//Eliminar elementos
		l.remove(2);
		System.out.println("La lista de tiene " + l.size() + " de Elementos");
		
		for (int i = 0; i < l.size(); i++) {
			Producto p = (Producto) l.get(i);
			System.out.println("Producto nombre es " + i + " " + p.nombre);
			System.out.println("Producto cantidad es " + " " + p.cantidad);
			System.out.println("con to String " + l.get(i).toString());
		}
		
		//Se eliminan valores del ArrayList
		l.clear();
		
		//Se imprime el numero de elementos del ArrayList
		System.out.println("La lista de tiene " + l.size() + " de Elementos");
	}

}
