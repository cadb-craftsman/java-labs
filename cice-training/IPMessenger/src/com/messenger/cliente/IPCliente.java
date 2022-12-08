package com.messenger.cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class IPCliente {

	private final int PORT = 5000;

	private String ip = null;
	private String hostName = null;

	private Socket socket;
	private BufferedReader bufferReader;
	private PrintWriter printWriter;

	/*
	 * Metodo que configura la red cuando se inicia el cliente,
	 */
	public void setUpNetworking() {
		try {
			socket = new Socket(this.getIP(), PORT);
			InputStreamReader inputStream = new InputStreamReader(socket.getInputStream());
			bufferReader = new BufferedReader(inputStream);
			printWriter = new PrintWriter(socket.getOutputStream());
			Thread t = new Thread(new ClientIncomingReader(bufferReader));
			t.start();
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	/*
	 * Metodo que envia los mensajes del cliente
	 */
	public void sendClientMessage(String message) {
		try {
			printWriter.println(message);
			printWriter.flush();
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	/*
	 * Metodo que devuelve la IP del host local
	 */
	public String getIP() {
		this.ip = "";
		try {
			InetAddress inet = InetAddress.getLocalHost();
			byte[] ipAddr = inet.getAddress();
			for (int i = 0; i < ipAddr.length; i++) {
				if (i > 0) {
					this.ip += ".";
				}
				this.ip += ipAddr[i] & 0xFF;
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		return this.ip;
	}

	public String getHostName() {
		try {
			InetAddress inet = InetAddress.getLocalHost();
			this.hostName = inet.getHostName();
		} catch (UnknownHostException e) {
			System.err.println(e);			
		}
		return this.hostName;
	}

}
