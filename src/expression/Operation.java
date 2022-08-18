package expression;

public abstract class Operation implements Expression {
	
	private final Expression leftExpression;
	private final Expression rightExpression;

	public Operation(Expression leftExpression, Expression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}
	
	public Expression getLeftExpression() {
		return leftExpression;
	}


	public Expression getRightExpression() {
		return rightExpression;
	}
	
	protected abstract String operationString();
	
	 @Override
	public String toString() {
		return "(" 
				+ this.getLeftExpression().toString() 
				+ this.operationString() 
				+ this.getRightExpression().toString() 
				+ 
				")";
	}

}
