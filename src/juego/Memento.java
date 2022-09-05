package juego;

public class Memento {
	
	private Juego juegoState;

	public Memento(Juego estado) {
		this.juegoState = estado;
	}

	public Juego getEstado() {
		return juegoState;
	}
	
	public void setJuego(Juego state) {
		this.juegoState = state;
	}

}
