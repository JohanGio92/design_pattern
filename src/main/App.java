package main;

import decoratorMIW.*;

public class App {

	public static void main(String[] args) {
		Component c = new ComponentA();
        Component da = new DecoratorA(c);
        System.out.println(da.view());
        System.out.println(new DecoratorB(c).view());
        System.out.println(new DecoratorB(da).view());
	}

}
