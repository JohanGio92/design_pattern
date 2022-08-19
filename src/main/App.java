package main;

import expression.Division;
import expression.Expression;
import expression.Multiplication;
import expression.Number;
import expression.Subtraction;
import expression.Summation;

public class App {

	public static void main(String[] args) {
		
		Expression expresion1 = new Summation(new Number(5), new Number(6));
		Expression expresion2 = new Summation(expresion1, new Number(8));
		Expression expresion3 = new Subtraction(expresion2, new Number(10));
		Expression expresion4 = new Division(expresion3, new Number(9));
		Expression expresion5 = new Multiplication(expresion4, new Number(20));
		
		System.out.println(expresion5);
		System.out.println(expresion5.operate());
		
	}

}
