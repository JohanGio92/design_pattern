package persona;

public class Alumno extends Persona {
	
	private String padron;

	private Alumno() {
		super();
		PersonRegistry.instance().register(this.getClass().getSimpleName(), this);
	}

	public String getPadron() {
		return padron;
	}

	public void setPadron(String padron) {
		this.padron = padron;
	}
	
	public static void register() {
		new Alumno();
	}

}
