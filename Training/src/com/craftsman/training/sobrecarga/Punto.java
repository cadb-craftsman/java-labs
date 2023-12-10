package com.craftsman.training.sobrecarga;

public class Punto {

	int x, y;
	
	Punto(int i, int j){
		x = i;
		y = j;
	}
	
	boolean iguales(Punto p){
		boolean respuesta;
		
		if ((p.x == x) && (p.y == y)) {
			respuesta = true;
		}else{
			respuesta = false;
		}
		
		return respuesta;
	}
	
}