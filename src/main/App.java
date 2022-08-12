package main;

import persona.Alumno;
import persona.Persona;

public class App {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		Persona persona = new Persona("johan", "revilla");
		Alumno alumno = new Alumno("valeria", "saavedra", "95698");
		alumno.setNombre("omar");
	}

}
