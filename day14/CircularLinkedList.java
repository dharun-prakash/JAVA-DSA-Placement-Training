package day14;

class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}

class CircularMethods{
	Node head = null;
	void insert(int d) {
		Node new_node = new Node(d);
		if(head==null) {
			head= new_node;
			head.next=head;
		}else {
			Node temp = head;
			while(temp.next!=head) {
				temp = temp.next;
			}
			new_node.next=head;
			temp.next=new_node;
		}
	}
	
	void display() {
		Node temp = head;
		do {
			System.out.println(temp.data);
			temp = temp.next;
		}
		while(temp!=head);
	}
}

public class CircularLinkedList {
	public static void main(String[] args) {
		CircularMethods obj = new CircularMethods();
		obj.insert(10);
		obj.insert(20);
		obj.insert(30);
		obj.display();
	}

}
