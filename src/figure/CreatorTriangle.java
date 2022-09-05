package figure;

import badFigure.Figure;
import badFigure.Triangle;

public class CreatorTriangle implements CreatorFigure {

	public CreatorTriangle() {
	}

	@Override
	public Figure create() {
		return new Triangle("tringle", 5, 5);
	}

}
