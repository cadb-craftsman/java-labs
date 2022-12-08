package com.craftsman.training.herencia;

public class CuboH extends CuboP{
	double peso;

	CuboH(CuboH ob) {
		super(ob);
		peso = ob.peso;
	}

	CuboH(double x, double y, double z, double m) {
		super(x, y, z);
		peso = m;
	}

	CuboH() {
		super();
		peso = -1;
	}

	CuboH(double len, double m) {
		super(len);
		peso = m;
	}

}
