package day15;

class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}

class StackMethods{
	Node head = null;
	void push(int d) {
		Node new_node = new Node(d);
		if(head == null) {
			head = new_node;
		}else {
			new_node.next=head;
			head=new_node;
		}
	}
	
	void pop() {
		if(head==null) {
			System.out.println("Empty");
			return;
		}else {
			head =head.next;
		}
	}
	void peek() {
		if(head==null) {
			System.out.println("No Peek");
		}else {
			System.out.println("Peek"+head.data);
		}
	}
	
	void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
		System.out.println();
		
	}
	
	void isempty() {
		if(head==null) {
			System.out.println("Yes Empty");
		}else {
			System.out.println("No Not  Empty");
		}
	}
}


public class StackConcept {
	public static void main(String[] args) {
		StackMethods obj = new StackMethods();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.display();
		obj.peek();
		System.out.println("---After Pop---");
		obj.pop();
		obj.pop();
		obj.pop();
		obj.peek();
		obj.isempty();
	}

}
