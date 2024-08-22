package co.edu.konradlorenz.controller;
import co.edu.konradlorenz.view.vista;

public class Controlador {

	public void run() {
		vista informacion = new vista(); 
		Controlador persona = informacion.ingresarDatos();
		informacion.mostrarInformacion(persona);
	}

}
