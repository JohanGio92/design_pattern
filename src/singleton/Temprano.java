package singleton;

public class Temprano {
	
	private static Temprano instance = new Temprano();

	private Temprano() {
		/*constructor privado para
		 * que no puedo ser instaciado*/
	}
	
	public static Temprano getInstance() {
		return instance;
	}
	
	public void metodo() {
		System.out.println("singleton temprano");
	}

}
