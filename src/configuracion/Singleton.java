package configuracion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Singleton {
	
	private static Singleton instance;

	protected Singleton() {
		/*Se necesita protected para que no se puede instanciar
		 *  y los hijos puedan heredar*/
	}
	
	@SuppressWarnings("deprecation")
	public static Singleton instance() {
		
		String line = Singleton.getSingletonConfigure();

		if(instance == null) {
			try {
				instance = (Singleton)
						Class.forName("configuracion." + line).newInstance();
			} catch (InstantiationException e) {
				assert false;
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				assert false;
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				assert false;
			}
		}
		return instance;
	}
	
	public static String getSingletonConfigure() {
		BufferedReader in = null;
		String line = "";
		try {
			in = new BufferedReader(new FileReader("singletonConfigure"));
			line = in.readLine().substring(12);
			
		} catch (IOException ioException) {
			System.err.println("IOException al leer este: " + ioException.getMessage());
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException ioException) {
					System.err.println("IOException al cerrar: " + ioException.getMessage());
				}
			}
		}
		return line;
	}
	
	public void metodoSingleton() {
		System.out.println("soy un singleton");
	}

}
