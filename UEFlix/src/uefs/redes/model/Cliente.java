package uefs.redes.model;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;






public class Cliente implements Runnable {

	
	private Socket socket;
	
	public Cliente(Socket s) throws IOException
	{
		socket = s;	
	
	}
	
	@Override
	public void run() 											//	INHERIT THE RUN METHOD FROM THE Runnable INTERFACE
	{
		try
		{
		

		}
		catch (Exception e)
		{
			e.printStackTrace();								//	MOST LIKELY WONT BE AN ERROR, GOOD PRACTICE TO CATCH THOUGH
		} 
	}
	

}
