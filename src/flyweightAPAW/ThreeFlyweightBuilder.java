package flyweightAPAW;

public class ThreeFlyweightBuilder extends FlyweightBuilder{

	@Override
	public Flyweight build() {
		if (flyweight == null) {
			flyweight = new Flyweight("three");
		}
		return flyweight;
	}
}
