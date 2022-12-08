package com.craftsman.training.academia;

import java.util.ArrayList;

public class Main {
	
	public static void main(String []args){		
		
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		ArrayList<Curso> cursos = new ArrayList<Curso>();
		
		Academia academia = new Academia("CICE", "O'Donell");		
		
		Empleado empleado = new Empleado("Lucia Arias", "Profesora Curso Java");
		Empleado empleadoA = new Empleado("Jose Perez",	"Director");
		
		empleados.add(empleado);
		empleados.add(empleadoA);
		
		Curso cursoJava = new Curso("Java", 123, 120);
		Curso cursoOracle = new Curso("Oracle", 321, 120);
		
		cursos.add(cursoJava);
		cursos.add(cursoOracle);

		System.out.println("Academia: " + academia.toString());
		
		for (int i = 0; i < empleados.size(); i++) {
			System.out.println("E " + i + " : " + empleados.get(i).toString());
		}
		
		for (int i = 0; i < cursos.size(); i++) {
			System.out.println("C " + i + " : " + cursos.get(i).toString());
		}		
	}
}