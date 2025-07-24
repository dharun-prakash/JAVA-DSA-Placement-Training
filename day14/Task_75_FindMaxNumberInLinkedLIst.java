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
class InsertNode{
	Node head = null;
	void insertBeg(int d) {
		Node new_node = new Node(d);
		if(head == null) {
			head = new_node;
		}else {
			new_node.next = head;
			head = new_node;
		}
	}
	
	void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	void max() {
		Node temp = head.next;
		int max = head.data;
//		System.out.print("Maximun element"+max);
		while(temp!=null) {
			if(max<temp.data) {
				max = temp.data;
			}	
			temp =temp.next;
//			System.out.print("Maximun element"+max);
		}
		System.out.print("Maximun element"+max);
	}
	
}

public class Task_75_FindMaxNumberInLinkedLIst {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		InsertNode obj = new InsertNode();
		for(int i = 0 ; i<size;i++) {
			int a = sc.nextInt();
			obj.insertBeg(a);
		}
		obj.display();
		obj.max();
	}

}
