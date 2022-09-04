package figure;

public class Cuadrado extends Figure {
	
	@Override
	public void showFigure() {
		System.out.println("soy un " + this.getClass().getSimpleName());
	}
}
