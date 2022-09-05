package figure;

import badFigure.Figure;

public class FiguresManager {
	
	private Figure figure;
	private CreatorFigure creatorFigure;

	public FiguresManager() {
	}
	
	public void setCreator(CreatorFigure creatorFigure) {
		this.creatorFigure = creatorFigure;
	}
	
	public Figure createFigure() {
		return creatorFigure.create();
	}
	
	public Figure getFigure() {
		return figure;
	}

}
