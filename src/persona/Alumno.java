package persona;

public class Alumno extends Persona {
	
	private String padron;

	public Alumno(String nombre, String apellido, String padron) {
		super(nombre, apellido);
		this.padron = padron;
	}

	public String getPadron() {
		return padron;
	}

	public void setPadron(String padron) {
		this.padron = padron;
	}
	
	@Override
	public void setNombre(String nombre) {
		super.nombre = nombre;
		super.id = 10;
		System.out.println("padre: " + super.nombre);
		System.out.println("hijo: " + this.nombre);
		System.out.println("static: " + super.id);
		System.out.println("static: " + Alumno.id);
		System.out.println("static: " + this.id);
	}

}
