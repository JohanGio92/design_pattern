package main;

import herencia.Profesor;

public class App {

	public static void main(String[] args) {
		
		Profesor profesor = new Profesor("johan","revilla",5);
		
		composicion.Profesor profesorComposicion =
				new composicion.Profesor("valeria", "saavedra", 28);
		
		profesor.setNombre("omar");
		
		System.out.println(profesor.getNombre());
		
		profesorComposicion.setNombre("alex");
		System.out.println(profesorComposicion.getNombre());

	}

}
