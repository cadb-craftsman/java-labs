package com.craftsman.training.vectores;

import java.util.Vector;

public class VectorEjercicio {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>(20);
		
		for (int i = 0; i < v.capacity(); i++) {
			v.insertElementAt(i, i);
		}
		
		System.out.println("Numero Elementos: " + v.size());
		System.out.println("Dimension: " + v.capacity());
		System.out.println("Elemento inicial: " + v.elementAt(0));
		System.out.println("Elemento final: " + v.elementAt(v.size()-1));

		v.remove(18);
		
		System.out.println("Numero Elementos: " + v.size());
		System.out.println("Dimension: " + v.capacity());
		
		v.insertElementAt(88, 18);
		
		System.out.println("Numero Elementos: " + v.size());
		System.out.println("Dimension: " + v.capacity());

		if (v.elementAt(12)!= null) {
			System.out.println("Elemento 12 " + v.indexOf(12));
		}else{
			System.out.println("No existe el elemento 12");
		}
	
		v.clear();
		for (int i = 0; i < v.capacity(); i++) {
			v.addElement(i * i);
		}

		for (int i = 0; i < v.size(); i++) {
			System.out.println("Elemento " + i + ":" + v.elementAt(i));
		}		
		
	}
	
}
