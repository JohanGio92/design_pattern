package main;

import singleton.Peresozo;
import singleton.Temprano;

public class App {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		Temprano.getInstance().metodo();
		Peresozo.getInstance().metodo();
	}

}
