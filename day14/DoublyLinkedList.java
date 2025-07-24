package day14;
import java.util.Scanner;

class NodeD{
	int data;
	NodeD prev;
	NodeD next;
	NodeD(int d){
		data = d;
		prev = null;
		next =null;
	}
}

class Double{
	NodeD head = null;
	void insertbeg(int d) {
		NodeD new_node = new NodeD(d);
		if(head==null) {
			head=new_node;
		}else {
			new_node.next=head;
			head.prev=new_node;
			head=new_node;
			
		}
			
	}
	
	void display() {
		NodeD temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	void reverse() {
		NodeD temp = head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.prev;
		}
	}
	
}

public class DoublyLinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Double obj = new Double();
		for(int i = 0; i< size;i++) {
			obj.insertbeg(sc.nextInt());
		}
		System.out.println("---Display---");
		obj.display();
		System.out.println("---Reverse---");
		obj.reverse();
		
		
	}
	

}
