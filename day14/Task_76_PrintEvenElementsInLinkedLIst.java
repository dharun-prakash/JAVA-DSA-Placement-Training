package day14;
import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}

class EvenList{
	Node head = null;
	void insertBeg(int d){
		Node new_node = new Node(d);
		if(head == null) {
			head= new_node;
		}else {
			new_node.next=head;
			head=new_node;
		}	
	}
	void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
	void even() {
		Node temp = head.next;
		while(temp!=null) {
			if(temp.data%2==0) {
			System.out.print(temp.data + " ");
			}
			temp = temp.next;
		}
	}
}

public class Task_76_PrintEvenElementsInLinkedLIst {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		EvenList obj = new EvenList();
		for(int i = 0;i<size;i++) {
			obj.insertBeg(sc.nextInt());
		}
		System.out.println("---List---");
		obj.display();
		System.out.println("---Even---");
		obj.even();
	}

}
