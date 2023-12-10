package com.messenger.cliente;

import java.io.BufferedReader;
import java.io.IOException;

public class ClientIncomingReader implements Runnable {

	private String message;
	BufferedReader bufferReader;
	
	public ClientIncomingReader(BufferedReader bufferReader){
		this.bufferReader = bufferReader;
	}
	
	@Override
	public void run() {
		String message;
		try {
			while ((message = bufferReader.readLine()) != null) {				
				setMessage(message);
			}
		} catch (IOException e) {
			System.err.println(e);
		}

	}

	public void setMessage(String message){
		this.message = message + "\n";
	}
	
	public String getMessage(){
		return message;
	}
	
}
