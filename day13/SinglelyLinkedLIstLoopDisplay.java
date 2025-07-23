package day13;

class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}

class InsertElements{
	Node head = null;
	void insertList(int d) {
		Node new_node = new Node(d);
		if(head == null) {
			head = new_node;
		}else {
			new_node.next=head;
			head = new_node;
		}
	}
	void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}
	
	void delete() {
		if(head == null) {
			System.out.print("Nothing");
		}
		head = head.next;
	}
	
}

public class SinglelyLinkedLIstLoopDisplay {
	public static void main(String[] args) {
		InsertElements obj = new InsertElements();
		obj.insertList(10);
		obj.display();
		System.out.println("-------------");
		obj.delete();
		obj.display();
		
		
	}

}
