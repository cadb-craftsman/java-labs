package com.craftsman.training.sobrecarga;

public class ClaseOperaciones {
	
	double suma(double x, double y){
		return (x + y);
	}

	double suma(double x, double y, double z){
		return (x + y + z);
	}	
	
	double suma(double [] array){
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			total  += array[i];
			
		}
		return (total);
	}	
}
