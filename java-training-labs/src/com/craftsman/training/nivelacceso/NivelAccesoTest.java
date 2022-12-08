package com.craftsman.training.nivelacceso;

public class NivelAccesoTest {

	public static void main(String[] args) {
		
		NivelesAcceso objeto = new NivelesAcceso();
		
		//Estos son correctos
		objeto.a = 10;
		objeto.b = 20;
		
		//Esto no es correcto, c es privado y se necesita acceder a traves de su metodo de acceso
		//objeto.c = //30 Produce una excepcion debido a que el miembro de la clase es privado y no es accesible directamente
		
		objeto.setC(30);
		System.out.println("C vale = " + objeto.getC());
	}
	
}
