package figure;

public class Square extends Figure {
	
	private double side;
	private static byte MAX_SIDE = 4;

	public Square(String name, double side) {
		super(name);
		this.side = side;
	}

	@Override
	public double area() {
		return Math.pow(side, 2);
	}

	@Override
	public double numberOfSide() {
		return MAX_SIDE;
	}

}
