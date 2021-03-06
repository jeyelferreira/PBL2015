package uefs.redes.controller;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import uefs.redes.define.Constants;
import uefs.redes.model.Servidor;



public class ControllerServidor {
	
	private ServerSocket socket_servidor ;
	private Socket client;
	
	public void start() throws IOException
	{
		socket_servidor = new ServerSocket(Constants.PORT );	//	SET PORT NUMBER
		System.out.println("Waiting for clients...");	//	AT THE START PRINT THIS
	
		while (true) 									//	WHILE THE PROGRAM IS RUNNING
		{												
			Socket s = socket_servidor.accept();					//	ACCEPT SOCKETS(CLIENTS) TRYING TO CONNECT
			System.out.println("Client connected from " + s.getLocalAddress().getHostName());	//	TELL THEM THAT THE CLIENT CONNECTED
			
			Servidor chat = new Servidor(s);				//	CREATE A NEW CLIENT OBJECT
			Thread t = new Thread(chat);				//	MAKE A NEW THREAD
			t.start();		
		
		}
	
	}
}

