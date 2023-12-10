package com.messenger.server;

import java.net.ServerSocket;
import java.net.Socket;

public class IPServidor{

	private final int PORT = 5000;
	
	/*
	 * Metodo que inicia el servidor y los Threads para escuchar a los clientes 
	 * que se conectan.
	 * 
	 * */
	public void go(){
		try {
			ServerSocket serverSocket = new ServerSocket(PORT);			
			while (true) {
				Socket clientSocket = serverSocket.accept();
				Thread t = new Thread(new ClientHandler(clientSocket));
				t.start();								
			}
			
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	
	public static void main(String[] args) {
		new IPServidor().go();
	}
}
