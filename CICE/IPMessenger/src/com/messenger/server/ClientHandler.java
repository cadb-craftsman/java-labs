package com.messenger.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class ClientHandler implements Runnable {

	ArrayList<PrintWriter> connectionList;
	InputStreamReader inputStream;
	BufferedReader bufferedReader;	
		
	/*
	 * Constructor de la clase, inicializa las variables de
	 * socket, inputStreamReader y bufferedReader
	 * 
	 * */
	public ClientHandler(Socket clientSocket){
		connectionList = new ArrayList<PrintWriter>();
		try {
			inputStream = new InputStreamReader(clientSocket.getInputStream());
			connectionList.add(new PrintWriter(clientSocket.getOutputStream()));			
			bufferedReader = new BufferedReader(inputStream);			
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	/*
	 * Se sobreescribe el metodo run que se implementa de Runnable
	 * 
	 * */
	@Override
	public void run() {
		String message;
		try {
			while((message = bufferedReader.readLine()) != null){
				System.out.println("message " + message);
				sendMessage(message);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	/*
	 * Metodo que envia mensajes gracias al PrintWriter que se crea para enviar 
	 * escribir los mensajes y mandarlos a travez del buffer
	 * */
	public void sendMessage(String message){		
		try {
			Iterator<PrintWriter> iterator = connectionList.iterator();
			while (iterator.hasNext()) {
				PrintWriter printWriter = iterator.next();
				printWriter.write(message);
				printWriter.flush();				
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		
	}

}
