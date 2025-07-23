package day13;

import java.util.Scanner;

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
	

	void insert_at_pos(Node val, int pos) {
    if (pos == 0) {
    	insertList(val);
        return;
    }
    Node newNode = new Node(val);
    Node temp = head;
    for (int i = 1; i < pos; i++) {
        temp = temp.next;
    }
    newNode.next = temp.next;
    temp.next = newNode;
}
	
}


public class Task_74_InsertElementInDeservePosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		int pos = sc.nextInt();
	
		InsertElements obj = new InsertElements();
		obj.insertList(10);
		obj.insertList(20);
		obj.insert_at_pos(3, 11);
		obj.insertList(30);
		obj.display();
		System.out.println("-------------");
		obj.delete();
		obj.display();
		
		
	}

}
