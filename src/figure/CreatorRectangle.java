package figure;

import badFigure.Figure;
import badFigure.Square;

public class CreatorRectangle implements CreatorFigure {

	public CreatorRectangle() {
	}

	@Override
	public Figure create() {
		return new Square("Square", 5);
	}

}
