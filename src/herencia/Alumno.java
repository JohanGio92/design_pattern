package herencia;

public class Alumno extends Persona {
	
	private String padron;

	public Alumno(String nombre, String apellido, String padron) {
		super(nombre, apellido);
		this.padron = padron;
	}

	@Override
	protected void doSomething() {
		System.out.println("I'm a Alumno");
	}

}
