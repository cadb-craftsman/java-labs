package com.cice.supermercado.menu;

import javax.swing.JOptionPane;

import com.cice.supermercado.producto.Producto;

public class Menu {

	public int mostrarMenu() {

		int opc = 0;
		try {
			opc = Integer.parseInt(JOptionPane
					.showInputDialog("Seleccione una opción del menu \n"
							+ "[1] Insertar producto\n"
							+ "[2] Eliminar producto\n"
							+ "[3] Listar Existencia de Productos\n"
							+ "[4] Buscar cantidad de produtos\n"
							+ "[5] Listar poca existencia de Productos\n"
							+ "[6] Salir\n"));

		} catch (NumberFormatException e) {
			System.err.println(e);
			opc = 0;
		}
		return opc;
	}

	public Producto mostrarDatosProducto() {

		String codigo = JOptionPane
				.showInputDialog("Insertar el codigo del producto");
		String nombre = JOptionPane
				.showInputDialog("Insertar el nombre del producto");
		String categoria = JOptionPane
				.showInputDialog("Insertar la categoria del producto");
		double cantidad = Double.parseDouble(JOptionPane
				.showInputDialog("Insertar la cantidad del producto"));

		Producto p = new Producto(codigo, nombre, categoria, cantidad);
		return p;

	}

	public String buscarProducto() {

		String codigo = JOptionPane
				.showInputDialog("Insertar el codigo del producto");

		return codigo;
	}
}
