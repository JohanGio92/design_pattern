package figure;

import badFigure.Circle;
import badFigure.Figure;

public class CreatorCircle implements CreatorFigure {

	public CreatorCircle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Figure create() {
		return new Circle("circle", 5);
	}

}
