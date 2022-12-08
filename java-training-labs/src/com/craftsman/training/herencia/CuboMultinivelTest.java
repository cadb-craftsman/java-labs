package com.craftsman.training.herencia;

public class CuboMultinivelTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Envio micubo = new Envio(10,20,15,10,3.41);
	     
	     double vol;
    
    	// c�lculo del volumen de Cubo 
	     vol = micubo.volumen();
	     System.out.println("Volumen igual a : "+ vol);
	     System.out.println("Peso igual a : "+ micubo.peso);
	     System.out.println("Coste igual a : "+ micubo.coste);

	}

}
