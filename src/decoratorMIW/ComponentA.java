package decoratorMIW;

public class ComponentA extends Component {

	@Override
	public String view() {
		return this.getClass().getSimpleName();
	}

}
