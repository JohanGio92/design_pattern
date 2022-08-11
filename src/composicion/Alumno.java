package composicion;

public class Alumno implements DoSomethingAble {
	
	private String padron;
	private Persona persona;

	public Alumno(String nombre, String apellido, String padron) {
		this.persona = new Persona(nombre, apellido);
		this.padron = padron;
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
	
	public void setPadron(String padron) {
		this.doSomething();
		this.padron = padron;
	}
	
	public String getPadron() {
		return this.padron;
	}
	
	@Override
	public void doSomething() {
		System.out.println("I'm a Alumno");
	}

}
