package visitor;

public class NumberOfSidesVisitor implements FigureVisitor {
	
	private double numberOfSide;

	public NumberOfSidesVisitor() {
		this.clear();
	}
	
	private void clear() {
		numberOfSide = 0;
	}

	@Override
	public void visit(Circle circle) {
		this.clear();
		numberOfSide = 10;
	}

	@Override
	public void visit(Square square) {
		this.clear();
		numberOfSide = 4;
	}

	@Override
	public void visit(Triangle triangle) {
		this.clear();
		numberOfSide = 3;
	}

	public double getNumberOfSide() {
		return numberOfSide;
	}
}
