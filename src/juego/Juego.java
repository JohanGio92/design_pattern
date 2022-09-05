package juego;

public class Juego {
	
	private String nombre;
	private int checkpoint;

	public Juego() {
	}

	public String getNombre() {
		return nombre;
	}

	public int getCheckpoint() {
		return checkpoint;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCheckpoint(int checkpoint) {
		this.checkpoint = checkpoint;
	}
	
	@Override
	public String toString() {
		String className = this.getClass().getSimpleName();
		
		return className 
				+ "[ nombre: " + this.getNombre() 
				+ ", checkpoint: " + this.getCheckpoint() + "]" ;
	}
}
