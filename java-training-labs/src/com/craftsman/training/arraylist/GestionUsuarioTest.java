package com.craftsman.training.arraylist;

import java.util.Scanner;

public class GestionUsuarioTest {

	public static void main(String[] args) {
		
		GestionUsuarios gU = new GestionUsuarios();
		Usuario u = new Usuario();
		Scanner lector = new  Scanner(System.in);
		
		System.out.println("Introduce el nombre del usuario");
		String nombre = lector.next();
		
		System.out.println("Se crea el usuario ");
		u.setUsuario(nombre);
		u.setPassword(u.generarPassword());
		System.out.println(u.toString());
		System.out.println("Se ha creado el usuario echo... " );
		
		System.out.println("Se asigna el usuario a la gestion de usuarios ");
		gU.insertarUsuario(u);		
		gU.listarUsuario();
		
		System.out.println("Se asigna el usuario a la gestion de usuarios echo... ");
		
		System.out.println("Se valida el usuario");		
		System.out.println("�El usuario existe: ? " + gU.validarUsuario(u));		
		System.out.println("Se valida el usuario echo... ");
	}
	
}
