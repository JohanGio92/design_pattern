package flyweightAPAW;

public class OneFlyweightBuilder extends FlyweightBuilder {

	@Override
	public Flyweight build() {
		if (flyweight == null) {
			flyweight = new Flyweight("one");
		}
		return flyweight;
	}

}
