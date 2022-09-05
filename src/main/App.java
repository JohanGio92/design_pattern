package main;

import badFigure.*;
import figure.CreatorCircle;
import figure.FiguresManager;

public class App {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		FigureManager figureManager = new FigureManager(FigureType.CIRCLE);
		
		figureManager.createFigure();
		
		System.out.println(figureManager.getFigure());
		System.out.println(figureManager.getType());
		
		FiguresManager figuresManager = new FiguresManager();
		figuresManager.setCreator(new CreatorCircle());
		System.out.println(figuresManager.createFigure());
	}

}
