package vehicle;

public abstract class Extra implements Vehicle {

	private Vehicle vehicle;

	public Extra(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	protected Vehicle getVehicle() {
		return vehicle;
	}
	
	@Override
	public String toString() {
		return this.getVehicle().toString() + " " + this.getClass().getSimpleName();
	}

}
