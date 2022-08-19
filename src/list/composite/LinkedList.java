package list.composite;

public class LinkedList {
	
	public Node head;
	private Node cursor;

	public LinkedList(int data) {
		this.head = new NodeComposite(data);
	}
	
	public void appendComposite(int data) {
		cursor = head;
		while(cursor.getNode() != null) {
			cursor = cursor.getNode();
		}
		cursor.setNode(new NodeComposite(data));
		cursor = head;
	}

	public void appendLeaf(int data) {
		cursor = head;
		while(cursor.getNode() != null) {
			cursor = cursor.getNode();
		}
		cursor.setNode(new NodeLeaf(data));
		cursor = head;
	}
	
	public void display() {
		this.head.iterate();
	}
	
	public void displayTest() {
		this.head.iterateTest(head);
	}
}
