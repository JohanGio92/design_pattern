package list;

public class Node {
	
	private Node next;
	private int data;

	public Node(int data, Node next) {
		this.next = next;
		this.data = data;
	}
	
	public Node getNext() {
		return this.next;
	}
	

	public void iterateNext() {
		if(this.next != null) {
			System.out.println(this.data);
			this.next.iterateNext();
		}
		System.out.println(this.data);
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
