package day14;
import java.util.Scanner;

class NodeD{
	int data;
	NodeD prev;
	NodeD next;
	NodeD(int d){
		data = d;
		prev = null;
		prev = null;
	}
}

class Doubly2{
	NodeD head = null;
	void insertend(int d) {
		NodeD new_node = new NodeD(d);
		if(head==null) {
			head = new_node;
		}else {
	        NodeD temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = new_node;
	        new_node.prev = temp;
		}
		
	}
	
	void display() {
		NodeD temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
		
	}
}

public class DoublyLinkedListInertEnd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Doubly2 obj = new Doubly2();
		for(int i=0;i<size;i++) {
			
			obj.insertend(sc.nextInt());
		}
		obj.display();
	}
	

}
