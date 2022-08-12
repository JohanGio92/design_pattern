package singleton;

public class Peresozo {

	private static Peresozo instance;

	private Peresozo() {
		/*constructor privado para
		 * que no puedo ser instaciado*/
	}

	public static Peresozo getInstance() {
		if(instance == null) {
			instance = new Peresozo();
		}
		return instance;
	}
	
	public void metodo() {
		System.out.println("singleton Peresozo");
	}
}
