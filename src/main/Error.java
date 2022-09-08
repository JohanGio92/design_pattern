package main;

public enum Error {
	NOTEMPTY(1),
	REPEATED_COORDINATE(2),
	NOT_PROPERTY(3);
	
	private int message;
	
	private Error(int message) {
		this.message = message;
	}
	
	int getEnumValue() {
		return NOT_PROPERTY.ordinal() + 1;
	}
	
	@Override
	public String toString() {
		return ""+ message;
	}
}
