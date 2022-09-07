package main;

import flyweightAPAW.Extrisenca;
import flyweightAPAW.Factory;
import flyweightAPAW.FlyweightConcrete;

public class App {

	public static void main(String[] args) {
		
		Factory factory = new Factory();
		
		FlyweightConcrete[] flyweightConcrete = new FlyweightConcrete[5];
		
		flyweightConcrete[0] = factory.get("uno");
		flyweightConcrete[1] = factory.get("dos");
		flyweightConcrete[2] = factory.get("tres");
		flyweightConcrete[3] = factory.get("dos");
		flyweightConcrete[4] = factory.get("uno");
		
		for (int i = 0; i < flyweightConcrete.length; i++) {
			System.out.println(flyweightConcrete[i].operation("---"));
		}

		for (int i = 0; i < flyweightConcrete.length; i++) {
			System.out.println(flyweightConcrete[i].operation("<<"));
		}
		
		Extrisenca extrisenca = new Extrisenca("---");
		extrisenca.display();
		extrisenca.setValue("<<");
		extrisenca.display();
		
		System.out.println(extrisenca.isTheSame());
	}

}
