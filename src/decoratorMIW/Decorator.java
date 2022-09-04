package decoratorMIW;

public abstract class Decorator extends Component {
	
	private Component component;

	public Decorator(Component component) {
		this.component = component;
	}

	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}
	
}
