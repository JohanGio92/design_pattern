package configuracion;

public class BSingleton extends Singleton {

	protected BSingleton() {
		super();
	}
	
	public void metodoB() {
		System.out.println("soy un B singleton");
	}

}
