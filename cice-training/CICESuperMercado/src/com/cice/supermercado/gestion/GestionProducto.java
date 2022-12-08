package com.cice.supermercado.gestion;

import java.util.ArrayList;

import com.cice.supermercado.producto.Producto;

public class GestionProducto {

	private ArrayList<Producto> listaDeProductos;

	public GestionProducto() {
		listaDeProductos = new ArrayList<Producto>();
	}

	public void insertarProducto(Producto p) {
		listaDeProductos.add(p);
	}

	public boolean eliminarProducto(String codigo) {

		boolean b = false;

		for (int i = 0; i < listaDeProductos.size(); i++) {
			if (listaDeProductos.get(i).getCodigoProducto()
					.equals(codigo)) {
				listaDeProductos.remove(i);
				b = true;
			} else {
				b = false;
			}
		}
		return b;
	}

	public void listarProductos() {
		for (int i = 0; i < listaDeProductos.size(); i++) {
			System.out.println(listaDeProductos.toString());
		}
	}

	public double buscarCantidadProducto(String codigo) {
		double c = 0;
		for (int i = 0; i < listaDeProductos.size(); i++) {
			if (listaDeProductos.get(i).getCodigoProducto()
					.equals(codigo)) {
				c = listaDeProductos.get(i).getCantidadProducto();
			}
		}
		return c;
	}

	public void listarAusenciaProducto() {
		for (int i = 0; i < listaDeProductos.size(); i++) {
			if (listaDeProductos.get(i).getCantidadProducto() < 5) {
				System.out.println(listaDeProductos.get(i).toString());
			}
		}
	}

	public ArrayList<Producto> getListaDeProductos() {
		return listaDeProductos;
	}

}
