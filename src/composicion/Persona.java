package composicion;

public abstract class Persona {
	
	private String nombre;
	private String apellido;
	
	public Persona(String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.doSomething();
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.doSomething();
		this.apellido = apellido;
	}
	
	protected abstract void doSomething();
	
}
