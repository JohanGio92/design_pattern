package visitor;

public class Triangle implements Figure {
	
	private double height;
	private double base;

	public Triangle(double height, double base) {
		this.height = height;
		this.base = base;
	}

	@Override
	public void accept(FigureVisitor figureVisitor) {
		figureVisitor.visit(this);
	}

	public double getHeight() {
		return height;
	}

	public double getBase() {
		return base;
	}

}
