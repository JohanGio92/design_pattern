package composicion;

public class Persona {
	
	private String nombre;
	private String apellido;
	
	public Persona(String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre, DoSomethingAble doSomethingAble) {
		doSomethingAble.doSomething();
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido, DoSomethingAble doSomethingAble) {
		doSomethingAble.doSomething();
		this.apellido = apellido;
	}
	
}
