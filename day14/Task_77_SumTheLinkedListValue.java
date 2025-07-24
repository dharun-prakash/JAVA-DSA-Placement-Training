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

class Task_77{
	Node head = null;
	void insertbeg(int d) {
		Node new_node = new Node(d);
		if(head==null) {
			head=new_node;
		}else {
			new_node.next=head;
			head=new_node;
		}
		
	}
	
	void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	void sum(int size) {
		Node temp = head;
		int sum = 0;
		while(temp!=null) {
			sum+=temp.data;
			temp = temp.next;
		}
		System.out.println(sum);
		System.out.println(sum/size);
	}
}

public class Task_77_SumTheLinkedListValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Task_77 obj = new Task_77();
		for(int i = 0;i<size;i++) {
			obj.insertbeg(sc.nextInt());
		}
		obj.display();
		obj.sum(size);
		
	}

}
