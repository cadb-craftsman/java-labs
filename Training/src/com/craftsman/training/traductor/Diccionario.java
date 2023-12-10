package com.craftsman.training.traductor;

import java.util.Scanner;

public class Diccionario {

	private String [][] bdPalabras;
	
	public void inicializarDiccionario (){
		
		bdPalabras = new String [2][25];
		bdPalabras[0][0] = "Hello";
		bdPalabras[1][0] = "Hola";
		bdPalabras[0][1] = "Bye";
		bdPalabras[1][1] = "Adios";
		for (int i = 2; i < 25; i++) {
			bdPalabras[0][i] = "";
			bdPalabras[1][i] = "";						
		}		
	}	
	
	public String leerPalabraIngles(Scanner lector){		
		System.out.println("Introduce una palabra en ingles");
		String palabra = lector.nextLine();
		return palabra;
	}
	
	public String leerPalabraEspanol(Scanner lector){		
		System.out.println("Introduce una palabra en espa�ol");
		String palabra = lector.nextLine();
		return palabra;
	}
	
	public void insertarPalabra(String pIngles, String pEspanol){		
		for (int i = 0; i < 25; i++) {			
			if (bdPalabras[0][i].equals("") && bdPalabras[1][i].equals("")) {
				bdPalabras[0][i] = pIngles;
				bdPalabras[1][i] = pEspanol;
				System.out.println("Palabra insertada");
				break;
			} else {
				System.out.println("La Palabra no se ha insertado");
			}						
		}			
	}
	
	public String buscarPalabra(String palabra) {
		String pEncontrada = "";
		for (int i = 0; i < 25; i++) {
			if (bdPalabras[0][i].trim().equals(palabra) || bdPalabras[1][i].trim().equals(palabra)) {				
				pEncontrada = bdPalabras[0][i];
				pEncontrada = bdPalabras[1][i];
				break;
			} else {
				pEncontrada = palabra + " no encontrada";
			}
		}
		return pEncontrada;
	}
	
	public void eliminarPalabra(String palabra){
		for (int i = 0; i < 25; i++) {
			if (bdPalabras[0][i].equals(palabra) || bdPalabras[1][i].equals(palabra)) {
				bdPalabras[0][i] = "";
				bdPalabras[1][i] = "";
			}
		}		
	}
	
	public void modificarPalabra(String pIngles, String pEspanol){		
		for (int i = 0; i < 25; i++) {
			if (bdPalabras[0][i].equals(pIngles) || bdPalabras[1][i].equals(pEspanol)) {
				bdPalabras[0][i] = pEspanol;
				bdPalabras[1][i] = pEspanol;
				break;
			}
		}		
	}
	
	public void mostrarDiccionario(){
		for (int i = 0; i < 25; i++) {
			System.out.println("palabras: " + bdPalabras[0][i] + " " + bdPalabras[1][i]);															
		}				
	}
}
