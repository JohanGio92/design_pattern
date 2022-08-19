package expression;

public class Multiplication extends Operation {

	public Multiplication(Expression leftExpression, Expression rightExpression) {
		super(leftExpression, rightExpression);
	}

	@Override
	public int operate() {
		return this.getLeftExpression().operate() *
				this.getRightExpression().operate();
	}

	@Override
	protected String operationString() {
		return "x";
	}

}
