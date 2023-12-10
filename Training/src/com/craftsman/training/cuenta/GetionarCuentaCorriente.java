package com.craftsman.training.cuenta;

import java.util.Scanner;

public class GetionarCuentaCorriente {
	
	static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String titular, numeroCuenta;
		double saldo;
		
		System.out.println("Pantalla de captura de nueva cuenta: ");		
		System.out.println("Introduce el titular de la cuenta");
		titular  = lector.nextLine();
		
		System.out.println("Introduce el numero de cuenta");
		numeroCuenta  = lector.nextLine();

		System.out.println("Introduce el saldo inicial");
		saldo  = lector.nextDouble();
		
		CuentaCorriente cuenta = new CuentaCorriente(titular, numeroCuenta, saldo);
		int opc = 0;
		
		do {
			opc = menu();
			
			switch (opc) {
			case 1:
				System.out.println("Por favor introdusca el importe a depositar en la cuenta " + cuenta.getNumeroCuenta());
				double ingresarCantidad = lector.nextDouble();
				cuenta.ingresarEfectivo(ingresarCantidad);
				break;
				
			case 2:
				System.out.println("Por favor introdusca el importe a retirar de la cuenta " + cuenta.getNumeroCuenta());
				double retirarCantidad = lector.nextDouble();
				cuenta.retirarEfectivo(retirarCantidad);				
				break;
				
			case 3:
				System.out.println("El saldo de la cuenta[ " + cuenta.getNumeroCuenta() + " ] es: " + cuenta.getSaldo());				
				break;
				
			case 4:
				System.out.println(cuenta.toString());
				break;
			
			case 5:
				System.out.println("Gracias por pertenecer al Banco el Popular");
				break;	
				
			default:
				System.out.println("El valor introducido es incorrecto");
				break;
			}
			
		} while (opc != 5);		
		
	}
	
	public static int menu(){		
		int opc = 0;		
		System.out.println("Bienvenido al Banco el Popular " +
						   "\n [Operaciones]" +
						   "\n 1 - Ingresar efectivo" +
						   "\n 2 - Retirar efectivo" + 
						   "\n 3 - Consulta Saldo" + 
						   "\n 4 - Consultar Cuenta" +
						   "\n 5 - Salir");
		opc = lector.nextInt();		
		return opc;
	}

}