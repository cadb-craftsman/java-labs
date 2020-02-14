package com.woowrale.personas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.apache.log4j.Logger;

import com.woowrale.personas.dao.PersonaDao;
import com.woowrale.personas.dao.PersonaDaoImpl;
import com.woowrale.personas.model.Persona;

public class PersonaBaseDatosMain {

	private PersonaDao personaDao;
	private static Logger logger = Logger.getLogger(PersonaBaseDatosMain.class);

	public PersonaBaseDatosMain(String url, String usr, String pwd) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/personas", "root", "root");
			personaDao = new PersonaDaoImpl(connection);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	public static void main(String[] args) {

		logger.info("Inicio de la aplicaci�n");
		PersonaBaseDatosMain pBaseDatos = new PersonaBaseDatosMain("jdbc:mysql://localhost:3306/personas", "root", "root");
		Scanner scaner = new Scanner(System.in);
		logger.info("Se evalua la opcion del usuario");
		int opc = 0;
		do {
			opc = pBaseDatos.drawMenu();
			//opc = pBaseDatos.drawMenuConsola(scaner);
			switch (opc) {

			case 1:
				logger.info("Se indico la opcion: " + opc);
				pBaseDatos.insertarPersona();				
				//pBaseDatos.insertarPersonaConsola(scaner);
				break;
			case 2:
				logger.info("Se indico la opcion: " + opc);
				pBaseDatos.consultarPersona();
				break;
			case 3:
				logger.info("Se indico la opcion: " + opc);
				pBaseDatos.consultarPersonas();
				break;
			case 4:
				logger.info("Se indico la opcion: " + opc);
				pBaseDatos.modificarPersona();
				//pBaseDatos.modificarPersonaConsola(scaner);
				break;
			case 5:				
				logger.info("Se indico la opcion: " + opc);
				pBaseDatos.eliminarPersona();
				//pBaseDatos.consultarPersonas();
				//pBaseDatos.eliminarPersonaConsola(scaner);
				break;
			}

		} while (opc != 6);
		logger.info("Se termino la aplicacion");
		scaner.close();
		System.exit(0);
	}

	public int drawMenu() {
		int opc = 0;

		try {
			opc = Integer.valueOf(JOptionPane.showInputDialog("Elegir una opcion: \n" + "1) Insertar Persona\n"
					+ "2) Consultar Persona\n" + "3) Consultar Personas\n" + "4) Modificar Persona\n"
					+ "5) Eliminar Persona\n" + "6) Salir\n"));

		} catch (Exception e) {
			logger.error("Opcion no valida: " + opc);
			JOptionPane.showMessageDialog(null, "Opcion no valida");
		}

		return opc;
	}

	public int drawMenuConsola(Scanner scaner) {
		int opc = 0;
		try {
			System.out.println("Elegir una opcion: \n" + "1) Insertar Persona\n"
					+ "2) Consultar Persona\n" + "3) Consultar Personas\n" + "4) Modificar Persona\n"
					+ "5) Eliminar Persona\n" + "6) Salir\n");
			opc = Integer.valueOf(scaner.nextLine());
		} catch (Exception e) {
			logger.error("Opcion no valida: " + opc);
			System.out.println("Opcion no valida");
		}
		return opc;
	}

	public void insertarPersona() {

		String nombre = JOptionPane.showInputDialog("Insertar Nombre:");
		String apellidos = JOptionPane.showInputDialog("Insertar Apellidos:");
		String direccion = JOptionPane.showInputDialog("Insertar Direcci�n:");
		Integer edad = 0;
		boolean isValid = true;
		do {
			try {
				edad = Integer.valueOf(JOptionPane.showInputDialog("Insertar Edad:"));
				isValid = true;
			} catch (Exception e) {
				isValid = false;
			}
		} while (!isValid);
		String email = JOptionPane.showInputDialog("Insertar Email");

		if(nombre.equals("") || apellidos.equals("") || direccion.equals("") || email.equals("")){
			JOptionPane.showMessageDialog(null, "No se puede insertar un usuario con informacion vacia");
		}else{
			personaDao.insertarPersona(new Persona(nombre, apellidos, direccion, edad, email));
		}		
	}

	public void insertarPersonaConsola(Scanner scaner) {

		System.out.println("Por favor insertar los datos de una persona separados por , por ejemplo: ");
		System.out.println("Juan,Sanchez,Direccion N1,40,j.sanchez@email.com \n");
		try {
			String pLine = scaner.nextLine();
			String[] linea = pLine.split(",");			
			if(linea[0].equals("") || linea[1].equals("") || linea[2].equals("") || linea[3].equals("")){
				System.err.println("No se puede insertar un usuario con informacion vacia");
			}else{
				personaDao.insertarPersona(new Persona(linea[0], linea[1], linea[2], Integer.valueOf(linea[3]), linea[4]));
			}
		} catch (Exception e) {
			System.err.println("Se ha producido una excepcion: " + e.getLocalizedMessage());
		}
	}

	public Persona consultarPersona() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Indicar la persona a consultar"));
		Persona p = new Persona();
		p.setId(id);
		Persona persona = personaDao.consultarPersona(new Persona(id, "", "", "", 0, ""));
		if (persona == null) {
			JOptionPane.showMessageDialog(null, "La persona indicada no existe");
		} else {
				System.out.println(persona.toString());
		}
		return persona;
	}

	public List<Persona> consultarPersonas() {
		List<Persona> personas = personaDao.consultarPersonas();
		for (Persona persona : personas) {
			System.out.println(persona.toString());
		}		
		return personas;
	}

	public void eliminarPersona() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Indicar la persona a eliminar"));
		Persona persona = personaDao.consultarPersona(new Persona(id, "", "", "", 0, ""));
		
		if(persona != null){
			int opc = JOptionPane.showConfirmDialog(null, "Desea eliminar a la persona: \n" + persona.toString(), "Eliminar Persona", JOptionPane.YES_NO_CANCEL_OPTION);
			if(opc == 0){
				if (personaDao.eliminarPersona(persona)) {
					JOptionPane.showMessageDialog(null, "Persona eliminada correctamente");
				}
			}
		}else{
			JOptionPane.showMessageDialog(null, "La persona indicada no existe");
		}
	}

	public void eliminarPersonaConsola(Scanner scaner) {
		System.out.println("Indicar la persona a eliminar: \n");
		String pLine = scaner.nextLine();

		if (!personaDao.eliminarPersona(new Persona(Integer.valueOf(pLine), "", "", "", 0, ""))) {
			System.out.println("La persona indicada no existe");
		} else {
			System.out.println("Persona eliminada correctamente");
		}
	}

	public void modificarPersona() {

		int id = Integer.parseInt(JOptionPane.showInputDialog("Indicar la persona a modificar"));
		Persona persona = personaDao.consultarPersona(new Persona(id, "", "", "", 0, ""));
		if (persona == null) {
			JOptionPane.showMessageDialog(null, "La persona indicada no existe");
		}else{
			int opc = JOptionPane.showConfirmDialog(null, "Desea modificar a la persona: \n" + persona.toString(),"Modificar Persona:", JOptionPane.YES_NO_CANCEL_OPTION);
			if(opc == 0){
				String nombre = JOptionPane.showInputDialog("Modificar Nombre " + persona.getNombre() + " ?");
				String apellidos = JOptionPane.showInputDialog("Modificar Apellidos " + persona.getApellidos() + " ?");
				String direccion = JOptionPane.showInputDialog("Modificar Direcci�n " + persona.getDireccion() + " ?");
				Integer edad = 0;
				boolean isValid = true;
				do {
					try {
						edad = Integer
								.valueOf(JOptionPane.showInputDialog("Modificar Edad " + persona.getEdad() + " ?"));
						isValid = true;
					} catch (Exception e) {
						isValid = false;
					}
				} while (!isValid);
				String email = JOptionPane.showInputDialog("Modificar Email " + persona.getEmail() + " ?");
		
				if(nombre.equals("") || apellidos.equals("") || direccion.equals("") || email.equals("")){
					JOptionPane.showMessageDialog(null, "No se puede modificar un usuario con informacion vacia");
				}else{			
					if (personaDao.actualizarPersona(persona, new Persona(nombre, apellidos, direccion, edad, email))) {
						JOptionPane.showMessageDialog(null, "Se ha modificado la persona correctamente");
					}
				}				
			}
		}
	}

	public void modificarPersonaConsola(Scanner scaner) {
		try {
			System.out.println("Indicar la persona a modificar: \n");	
			String pLine = scaner.nextLine();			
			Persona persona = personaDao.consultarPersona(new Persona(Integer.valueOf(pLine), "", "", "", 0, ""));
			if(persona != null){
				System.out.println("Desea modificar a la persona: \n" + persona.toString());
				System.out.println("Por favor insertar los datos de la persona a modificar separados por , ");				
				pLine = scaner.nextLine();
				String[] linea = pLine.split(",");
				if(linea[0].equals("") || linea[1].equals("") || linea[2].equals("") || linea[3].equals("")){
					System.err.println("No se puede insertar un usuario con informacion vacia");
				}else{
					if (personaDao.actualizarPersona(persona, new Persona(linea[0], linea[1], linea[2], Integer.valueOf(linea[3]), linea[4]))) {
						System.out.println("Se ha modificado la persona correctamente");
					}			
				}
			}else{
				System.out.println("La persona indicada no existe");
			}
		} catch (Exception e) {
			System.err.println("Se ha producido una excepcion: " + e.getLocalizedMessage());
		}
	}	
}
