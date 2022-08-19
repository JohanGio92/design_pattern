package expression;

public class Subtraction extends Operation {

	public Subtraction(Expression leftExpression, Expression rightExpression) {
		super(leftExpression, rightExpression);
	}

	@Override
	public int operate() {
		return this.getLeftExpression().operate() - 
				this.getRightExpression().operate();
	}

	@Override
	protected String operationString() {
		return "-";
	}

}
