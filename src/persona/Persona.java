package persona;

public class Persona {
	
	protected static Persona instance;
	private String nombre;
	private String apellido;

	protected Persona() {
		PersonRegistry.instance().register(this.getClass().getSimpleName(), this);
	}
	
	public static Persona instance() {
		if(instance == null) {
			instance = PersonRegistry.instance().lookup("Alumno");
		}
		return instance;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
