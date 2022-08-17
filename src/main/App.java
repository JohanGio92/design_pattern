package main;

import visitor.*;

public class App {

	public static void main(String[] args) {
		FigureManager figureManager = new FigureManager();
		figureManager.add(new Circle(5));
		figureManager.add(new Square(10));
		figureManager.add(new Triangle(5, 2));
		
		System.out.println("total area: " + figureManager.totalArea());
		System.out.println("total number of side: " + figureManager.totalNumberOfSides());
	}

}
