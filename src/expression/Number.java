package expression;

public class Number implements Expression {
	
	private final int value;

	public Number(int value) {
		this.value = value;
	}

	@Override
	public int operate() {
		return this.value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
