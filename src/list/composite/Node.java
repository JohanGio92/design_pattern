package list.composite;

public abstract class Node {
	
	private int data;

	public Node(int data) {
		this.data = data;
	}
	
	public abstract void setNode(Node node);
	
	public abstract Node getNode();
	
	public abstract void iterate();

	public abstract void iterateTest(Node node);

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}
