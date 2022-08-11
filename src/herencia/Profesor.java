package herencia;

public class Profesor extends Persona {
	
	private int id;

	public Profesor(String nombre, String apellido, int id) {
		super(nombre, apellido);
		this.id = id;
	}

	@Override
	protected void doSomething() {
		System.out.println("I'm profesor");
	}

}
