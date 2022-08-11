package composicion;

public class Profesor implements DoSomethingAble {
	
	private int id;
	private Persona persona;

	public Profesor(String nombre, String apellido, int id) {
		this.persona = new Persona(nombre, apellido);
		this.id = id;
	}

	public void setNombre(String nombre) {
		persona.setNombre(nombre, this);
	}
	
	public String getNombre() {
		return persona.getNombre();
	}

	public void setApellido(String apellido) {
		persona.setApellido(apellido, this);
	}
	
	public String getApellido() {
		return persona.getApellido();
	}

	public void setID(int id) {
		this.doSomething();
		this.id = id;
	}
	
	public int getID() {
		return this.id;
	}

	@Override
	public void doSomething() {
		System.out.println("I'm profesor");
	}

}
