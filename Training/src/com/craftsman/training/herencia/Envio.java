package com.craftsman.training.herencia;

public class Envio extends CuboH {

	double coste;

	Envio(Envio ob) {
		super(ob);
		coste = ob.coste;
	}

	Envio(double x, double y, double z, double m, double e)
	{
		super(x,y,z,m);
		coste = e;
	}

	Envio() {
		super();
		coste = -1;
	}

	Envio(double len, double m, double e) {
		super(len, m);
		coste = e;
	}

}
