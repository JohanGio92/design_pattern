package main;

import java.io.File;

import configuracion.ASingleton;
import configuracion.Singleton;
import estatico.HijoEstatico;
import estatico.PadreEstatico;
import figure.Circulo;
import figure.Cuadrado;
import figure.Figure;
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
		Profesor.instance().setNombre("omar");
		System.out.println(Alumno.instance().getNombre());
		System.out.println(Profesor.instance().getNombre());
		System.out.println(Alumno.instance());
		System.out.println(Profesor.instance());
		Figure.instance().showFigure();
		Cuadrado.instance().showFigure();
		Circulo.instance().showFigure();
	}
}
