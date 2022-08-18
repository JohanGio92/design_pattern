package expression;

public class Summation extends Operation {

	public Summation(Expression leftExpression, Expression rightExpression) {
		super(leftExpression, rightExpression);
	}

	@Override
	public int operate() {
		return this.getLeftExpression().operate() + 
				this.getRightExpression().operate();
	}

	@Override
	protected String operationString() {
		return "+";
	}

}
