package day15;

class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}

class QueueMethods{
	Node head = null;

	void enqueue(int d) {
		Node temp = head;
		Node new_node = new Node(d);
		if(head == null) {
			head = new_node;
		}else {
			while(temp.next!=null) {
				
				temp = temp.next;
			}
			temp.next = new_node;
		}
	}
	
	void dequeue() {
		if(head==null) {
			System.out.print("Empty");
		}else {
			head = head.next;
		}
	}
	
	void peek() {
		if(head==null) {
			System.out.println("No peek");
		}else {
			System.out.println(head.data);
		}
	}
	
	void isempty() {
		if(head==null) {
			System.out.println("Yes Empty");
		}else {
			System.out.println("No not empty");
		}
	}
	
	void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}

public class QueueConcept {
	public static void main(String[] args) {
		QueueMethods obj = new QueueMethods();
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.display();
		System.out.println("-------");
		obj.dequeue();
		obj.display();
		obj.peek();
		obj.isempty();
		
		
	}

}
