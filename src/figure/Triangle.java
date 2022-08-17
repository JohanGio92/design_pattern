package figure;

public class Triangle extends Figure {
	
	private double base;
	private double height;
	private static byte MAX_SIDE = 3;

	public Triangle(String name, double base, double height) {
		super(name);
		this.base = base;
		this.height = height;
	}

	@Override
	public double area() {
		return this.base * this.height;
	}

	@Override
	public double numberOfSide() {
		return MAX_SIDE;
	}

}
