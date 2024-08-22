package co.edu.konradlorenz.view;

import java.util.Scanner;

import co.edu.konradlorenz.controller.Controlador;
import co.edu.konradlorenz.model.estudiante;


public class vista {
	
    private static Scanner leer = new Scanner(System.in);
    
    public Controlador ingresarDatos() {
        System.out.print("Ingrese el nombre del estudiante ");
        String nombreEstudiante = leer.nextLine();

        System.out.print("Ingrese el programa del estudiante ");
        String programa = leer.nextLine();

        System.out.print("Ingrese el codigo del estudiante");
        int codigoEstudiante = leer.nextInt();
        leer.nextLine(); 

        return new Controlador ();
    }
    public void mostrarInformacion (estudiante Estudiante) {
    	
    	System.out.println("------------------------------");
    	System.out.println("-----Datos del estudiante-----");
    	System.out.println("Nombre 	 del estudiante: "+ Estudiante.getNombreEstudiante());
    	System.out.println("Programa del estudiante: "+Estudiante.getPrograma());
    	System.out.println("Codigo del estudiate: "+Estudiante.getCodigoEstudiante());
    	System.out.println("------------------------------");

    }

 }
