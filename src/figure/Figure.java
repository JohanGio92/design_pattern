package figure;

public class Figure {

	protected static Figure instance;
	
	protected Figure() {
	}
	
	public static Figure instance() {
		if(instance == null) {
			instance = new Figure();
		}
		return instance;
	}
	
	public void showFigure() {
		System.out.println("soy una figura");
	}
	
}
