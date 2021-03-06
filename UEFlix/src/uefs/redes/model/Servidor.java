package uefs.redes.model;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class Servidor implements Runnable{

	
	private Socket socket;
	
	public Servidor(Socket s) throws IOException
	{
		this.socket = s;

	}
	
	@Override
	public void run()											//	(IMPLEMENTED FROM THE RUNNABLE INTERFACE)
	{
		try	
		{
			ObjectInputStream in;
			do
			{
				in =  new  ObjectInputStream(socket.getInputStream());
				String x = (String) in.readObject();
				System.out.println(x);
			}
			while(socket.getInputStream() != null);
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();								
		}	
	}

}
