package list;

public class List {
	
	public Node head;
	public Node cursor;

	public List(int data) {
		this.head = new Node(data, null);
		this.cursor = null;
	}
	
	public void append(int data) {
		cursor = head;
		while(cursor.getNext() != null) {
			cursor = cursor.getNext();
		}
		cursor.setNext(new Node(data, null));
		cursor = head;
	}
	
	public void display() {
		cursor.iterateNext();
	}
	
	public void print() {
		if(cursor.getNext() != null) {
			System.out.println(cursor.getData());
			this.cursor = this.cursor.getNext();
			this.print();
		}
		System.out.println(cursor.getData());
	}

}
