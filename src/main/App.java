package main;

import herencia.Profesor;

public class App {

	public static void main(String[] args) {
		
		Profesor profesor = new Profesor("johan","revilla",5);
		
		profesor.setNombre("valeria");
		
		System.out.println(profesor.getNombre());

	}

}
