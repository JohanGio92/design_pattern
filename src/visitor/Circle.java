package visitor;

public class Circle implements Figure {
	
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public void accept(FigureVisitor figureVisitor) {
		figureVisitor.visit(this);
	}

}
