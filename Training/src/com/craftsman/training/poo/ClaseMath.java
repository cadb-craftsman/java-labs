package com.craftsman.training.poo;

public class ClaseMath {

	public double calcularVolumenCilindro(double radio, double altura){
		double resultado  = ((Math.PI * (radio * radio)) * altura);
		return resultado;
	}
	
	public static void main(String[] args) {
		
		ClaseMath calcular = new ClaseMath();
		double volumen = calcular.calcularVolumenCilindro(2.5, 10);		
		System.out.println("Volumen del cilindro: " + volumen);
	}	
}