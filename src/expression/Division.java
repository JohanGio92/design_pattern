package expression;

public class Division extends Operation {

	public Division(Expression leftExpression, Expression rightExpression) {
		super(leftExpression, rightExpression);
	}

	@Override
	public int operate() {
		return this.getLeftExpression().operate() /
				this.getRightExpression().operate();
	}

	@Override
	protected String operationString() {
		return "÷";
	}

}
