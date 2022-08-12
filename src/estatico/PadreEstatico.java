package estatico;

public class PadreEstatico {
	
	public static int A = 1;
	private static int B = 2;
	protected static int C = 3;
	private int simple  = 4;

	public PadreEstatico() {
		// TODO Auto-generated constructor stub
	}
	
	public void metodoSimple() {
		System.out.println("simple metodo");
	}
	
	public static void metodoA() {
		System.out.println("soy un metodo A");
	}

	protected static void metodoB() {
		System.out.println("soy un metodo B " + PadreEstatico.B);
	}

	public static void metodoC() {
		System.out.println("soy un metodo C " + PadreEstatico.C);
		PadreEstatico.metodoB();
	}
}
