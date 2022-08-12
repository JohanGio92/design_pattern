package main;

import configuracion.ASingleton;
import configuracion.Singleton;
import estatico.HijoEstatico;
import estatico.PadreEstatico;
import persona.Alumno;
import persona.PersonRegistry;
import persona.Persona;
import persona.Profesor;
import singleton.Peresozo;
import singleton.Temprano;

public class App {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		Temprano.getInstance().metodo();
		Peresozo.getInstance().metodo();
		System.out.println(Singleton.getSingletonConfigure());
		System.out.println(Singleton.instance());
		System.out.println(Temprano.getInstance());
		HijoEstatico.metodoC();
		
		Alumno.register();
		Profesor.register();
		
		//Persona.instance().setNombre("johan");
		
		Alumno.instance().setNombre("johan");
		System.out.println(Alumno.instance().getNombre());
	}
}
