package main;

import memento.GestorMementos;
import memento.Originador;
import memento.*;

public class App {
	
	public static void badMemento() {
		//String nombreJuego = "Crash Bandicoot";

		//Juego juego = new Juego();
		//juego.setNombre(nombreJuego);
		//juego.setCheckpoint(1);

		//Caretaker caretaker = new Caretaker();
		//Originator originator = new Originator();

		//juego = new Juego();
		//juego.setNombre(nombreJuego);
		//juego.setCheckpoint(2);
		//originator.setEstado(juego);

		//juego = new Juego();
		//juego.setNombre(nombreJuego);
		//juego.setCheckpoint(3);		
		//originator.setEstado(juego);

		//caretaker.addMemento(originator.guardar()); // ESTADO POSICION 0

		//juego = new Juego();
		//juego.setNombre(nombreJuego);
		//juego.setCheckpoint(4);

		//originator.setEstado(juego);
		//caretaker.addMemento(originator.guardar()); // ESTADO POSICION 1

		//juego = new Juego();
		//juego.setNombre(nombreJuego);
		//juego.setCheckpoint(5);
		//originator.setEstado(juego);
		//caretaker.addMemento(originator.guardar()); // ESTADO POSICION 2

		//originator.setEstado(juego);
		//originator.restaurar(caretaker.getMemento(1));

		//juego = originator.getEstado();
		//System.out.println(juego);
	}

	public static void main(String[] args) {
		//badMemento();
		
		Originador originador = new Originador(0);
		System.out.println(originador);
		originador.setCadena("circulo");
		originador.setValor(5);
		System.out.println(originador);
		GestorMementos<Memento> gestorMementos = new GestorMementos<>();
		gestorMementos.addMemento("state1" , originador.createMemento());
		originador.setCadena("rectangle");
		originador.setValor(6);
		System.out.println(originador);
		
		originador.restoreMemento(gestorMementos.getMemento("state1"));
	}

}
