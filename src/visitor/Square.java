package visitor;

public class Square implements Figure {
	
	private double side;

	public Square(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	@Override
	public void accept(FigureVisitor figureVisitor) {
		figureVisitor.visit(this);
	}

}
