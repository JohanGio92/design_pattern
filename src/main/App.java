package main;

import list.List;

public class App {

	public static void main(String[] args) {
		System.out.println("hello world");
		List list = new List(5);
		list.append(6);
		list.append(7);
		list.append(8);
		list.append(9);
		list.append(10);
		//System.out.println(list.head.getData());
		//System.out.println(list.head.getNext().getData());
		//list.display();
		list.print();
	}

}
