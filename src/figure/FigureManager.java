package figure;

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
		double result = 0;
		for (Figure figure : figures) {
			result += figure.area();
		}
		return result;
	}
	
	public double totalNumberOfSides() {
		double result = 0;
		for (Figure figure : figures) {
			result += figure.numberOfSide();
		}
		return result;
	}

}
