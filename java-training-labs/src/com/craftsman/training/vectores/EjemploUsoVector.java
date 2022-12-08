package com.craftsman.training.vectores;

import java.util.Vector;

public class EjemploUsoVector {

	public static void main(String[] args) {
		Vector<Object> v = new Vector<Object>(20, 5);
		v.addElement("uno");
		v.insertElementAt("dos", 1);
		v.insertElementAt("cuatro", 2);
		v.insertElementAt("tres", 3);
		v.insertElementAt(4, 4);

		System.out.println("tama�o del vector: " + v.size());
		System.out.println("dimension del vector: " + v.capacity());

		for (int i = 0; i < v.size(); i++) {
			System.out.println("Elemento " + i + ":" + v.elementAt(i));
		}
		
		v.remove(1);
		v.clear();
		
		if (v.isEmpty()) {
			System.out.println("Esta vacio");
		} else {
			System.out.println("No esta vacio");
			for (int i = 0; i < v.size(); i++) {
				System.out.println("Elemento " + i + ":" + v.elementAt(i));
			}
			System.out.println("tama�o del vector: " + v.size());
			System.out.println("dimension del vector: " + v.capacity());
		}
	}

}