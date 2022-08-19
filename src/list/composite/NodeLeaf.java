package list.composite;

public class NodeLeaf extends Node {

	public NodeLeaf(int data) {
		super(data);
	}

	@Override
	public void setNode(Node node) {
	}

	@Override
	public Node getNode() {
		return null;
	}

	@Override
	public void iterate() {
		System.out.println(this.getData());
	}

	@Override
	public void iterateTest(Node node) {
		System.out.println(node.getData());
	}

}
