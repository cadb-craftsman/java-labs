package com.craftsman.training.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaConsola {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		String s;
		int numero;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(isr);

		try {
			while ((s = stdin.readLine()) != null) {
				System.out.println("s: " + s);
				numero = Integer.parseInt(s);
				System.out.println("numero " + numero);
			}			
		} catch (IOException e) {
			System.err.println(e);
		} catch (NumberFormatException e) {
			System.err.println(e);
		} finally {
			stdin.close();
			isr.close();
		}
	}
}
