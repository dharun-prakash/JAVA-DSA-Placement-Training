package day12;

class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}

class Insertlist{
	Node head = null;
	void insertList(int d) {
		Node new_node = new Node(d);
		if(head==null) {
			head = new_node;
		}
		else {
			head.next = new_node;
			head = new_node;
			
		}
	}
	void display() {
		System.out.print(head.data);
	}
}

public class SinglelyLinkedListConcept {
	public static void main(String[] args) {
		Insertlist obj = new Insertlist();
		obj.insertList(10);
		obj.display();
	}

}
