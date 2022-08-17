package figure;

public class Circle extends Figure {
	
	private double radius;

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double numberOfSide() {
		return Double.POSITIVE_INFINITY;
	}

}
