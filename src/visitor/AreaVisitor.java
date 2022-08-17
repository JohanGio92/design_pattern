package visitor;

public class AreaVisitor implements FigureVisitor {
	
	private double area;

	public AreaVisitor() {
		this.clear();
	}
	
	private void clear() {
		this.area = 0;
	}

	@Override
	public void visit(Circle circle) {
		this.clear();
		this.area = Math.PI * Math.pow(circle.getRadius(), 2);
	}

	@Override
	public void visit(Square square) {
		this.area = Math.pow(square.getSide(), 2);
	}

	@Override
	public void visit(Triangle triangle) {
		this.area = triangle.getBase() * triangle.getHeight();
	}
	
	public double getArea() {
		return this.area;
	}

}
