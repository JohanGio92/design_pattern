package flyweightAPAW;


public class Extrisenca {

	private String value;
	private Flyweight[] flyweight;
	
	public Extrisenca(String value) {
		this.value = value;
		
		flyweight = new Flyweight[5];
		
		flyweight[0] = new OneFlyweightBuilder().build();
		flyweight[1] = new TwoFlyweightBuilder().build();
		flyweight[2] = new ThreeFlyweightBuilder().build();
		flyweight[3] = new TwoFlyweightBuilder().build();
		flyweight[4] = new OneFlyweightBuilder().build();
		
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public void display() {
		for (int i = 0; i < flyweight.length; i++) {
			System.out.println(this.value + this.flyweight[i].getIntrinseco() + this.value);
		}
	}
	
	public boolean isTheSame() {
		return flyweight[0] == flyweight[4];
	}
}
