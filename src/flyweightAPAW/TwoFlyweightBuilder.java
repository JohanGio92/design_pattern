package flyweightAPAW;

public class TwoFlyweightBuilder extends FlyweightBuilder {

	@Override
	public Flyweight build() {
		if (flyweight == null) {
			flyweight = new Flyweight("two");
		}
		return flyweight;
	}
}
