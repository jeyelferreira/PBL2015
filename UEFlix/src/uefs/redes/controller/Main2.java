package uefs.redes.controller;

import java.io.IOException;

public class Main2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ControllerCliente x = new ControllerCliente();
		x.Conectar();
		x.Enviar();
		x.Enviar();
		x.Enviar();
		
	}

}
