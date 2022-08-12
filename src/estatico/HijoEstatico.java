package estatico;

import javax.management.remote.SubjectDelegationPermission;

public class HijoEstatico extends PadreEstatico {

	public HijoEstatico() {
		// TODO Auto-generated constructor stub
	}
	
	public static void metodoA() {
		PadreEstatico.metodoB();
		PadreEstatico.metodoA();
	}
	
	public static void metodoD() {
		//no se puede heredar un atributo y metodo estatico privado
		System.out.println("soy un metodo D + B: " + PadreEstatico.B);
	}

}
