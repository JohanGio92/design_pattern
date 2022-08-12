package persona;

public class Profesor extends Persona {
	
	private int id;

	private Profesor() {
		super();
		PersonRegistry.instance().register(this.getClass().getSimpleName(), this);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void register() {
		new Profesor();
	}
}
