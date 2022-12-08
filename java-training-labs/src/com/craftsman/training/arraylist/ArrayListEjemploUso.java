package com.craftsman.training.arraylist;

import java.util.ArrayList;

public class ArrayListEjemploUso {
	
	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<String>(); 	//ArrayList donde se especifica el tipo de dato
		l.add("Hola");
		l.add("Adios");
		l.add("Ciao");
		l.add("Bye");
		l.add(2, "Bye");
		
		for (int i = 0; i < l.size(); i++) {
			String s = l.get(i);
			System.out.println("elemento " + i + ": " + s);
		}
		
		l.remove("Ciao");
		System.out.println("Tama�o: " + l.size());
		for (int i = 0; i < l.size(); i++) {
			String s = l.get(i);
			System.out.println("elemento " + i + ": " + s);
		}		
	}
}
