package main;

import decoratorMIW.*;
import vehicle.*;

public class App {

	public static void main(String[] args) {
		Component c = new ComponentA();
        Component da = new DecoratorA(c);
        System.out.println(da.view());
        System.out.println(new DecoratorB(c).view());
        System.out.println(new DecoratorB(da).view());
        
        Vehicle model = new Model(35, "ford");
        System.out.println(model.price());
        System.out.println(model.description());
        
        Vehicle gps = new GPS(model);
        System.out.println(gps.price());
        System.out.println(gps.description());
        
        Vehicle mp3 = new MP3(gps);
        System.out.println(mp3.price());
        System.out.println(mp3.description());
        
        System.out.println(mp3);
	}

}
