package list.composite;

public class NodeComposite extends Node {
	
	private Node node;

	public NodeComposite(int data) {
		super(data);
		node = null;
	}

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

	@Override
	public void iterate() {
		System.out.println(this.getData());
		this.node.iterate();
	}

	@Override
	public void iterateTest(Node node) {
		System.out.println(node.getData());
		this.node.iterateTest(this);
	}

}
