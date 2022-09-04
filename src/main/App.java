package main;

import model.Subject;
import view.*;

public class App {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new ObserverArgentianDollar(subject);
		new ObserverMexicanDollar(subject);
		new ObserverPeruvianDollar(subject);
		
		System.out.println("Si desea cambiar 10 dólares obtendrá : ");
		subject.setState(10);
		System.out.println("-----------------");
		System.out.println("Si desea cambiar 100 dólares obtendrá : ");
		subject.setState(100);
	}

}
