package com.craftsman.training.cuenta;

public class CuentaCorriente {

	private String titular;
	private String numeroCuenta;
	private double saldo;

	public CuentaCorriente() {
		super();
	}

	public CuentaCorriente(String titular, String numeroCuenta, double saldo) {
		super();
		this.titular = titular;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void ingresarEfectivo(double ingresarCantidad){
		double total = this.getSaldo() + ingresarCantidad;
		setSaldo(total);
	}	
	
	public void retirarEfectivo(double retirarCantidad){
		if (this.getSaldo() > retirarCantidad) {
			double total = this.getSaldo() - retirarCantidad;
			setSaldo(total);
		}else{
			System.out.println("Saldo insuficioente para realizar la operaci�n");
		}		
	}	
	
	public String toString(){
		String datosCuenta = "Datos de la cuenta: " + 
		   					 "\nTitular: " + getTitular()+
		   					 "\nNumero de Cuenta: " + getNumeroCuenta() + 
		   					 "\nSaldo: " + getSaldo();
		return datosCuenta;		
	}
}