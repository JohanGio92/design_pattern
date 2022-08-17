package visitor;

import java.util.ArrayList;
import java.util.List;

public class FigureManager {
	
	private List<Figure> figures;

	public FigureManager() {
		this.figures = new ArrayList<>();
	}
	
	public void add(Figure figure) {
		figures.add(figure);
	}
	
	public double totalArea() {
		AreaVisitor areaVisitor = new AreaVisitor();
		double result = 0;
		for (Figure figure : figures) {
			figure.accept(areaVisitor);
			result += areaVisitor.getArea();
		}
		return result;
	}
	
	public double totalNumberOfSides() {
		NumberOfSidesVisitor sidesVisitor = new NumberOfSidesVisitor();
		double result = 0;
		for (Figure figure : figures) {
			figure.accept(sidesVisitor);
			result += sidesVisitor.getNumberOfSide();
		}
		return result;
	}

}
