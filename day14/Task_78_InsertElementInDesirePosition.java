package day14;

import java.util.Scanner;

class NodeD{
	int data;
	NodeD prev;
	NodeD next;
	NodeD(int d){
		data = d;
		prev = null;
		next = null;
	}
}

class Task_78{
	NodeD head = null;
	void insertBeg(int d) {
		NodeD new_node = new NodeD(d);
		if (head == null) {
			head = new_node;
		}
		else {
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
	
	void update(int val,int pos) {
		NodeD temp = head;
		int count=1;
		while(temp!=null) {
			if(count == pos) {
				NodeD new_node = new NodeD(val);
				if(temp!=head) {
				new_node.prev = temp.prev;
				new_node.next = temp;
				temp.prev.next = new_node;
				temp.prev = new_node;
				}else {
					new_node.prev = null;
					new_node.next = head;
					head.prev=new_node;
					head = new _node;
				}
				
			}
			System.out.println("Count"+count);
			System.out.println("pos"+pos);
			count++;
			temp = temp.next;

		}
		
	}
}
public class Task_78_InsertElementInDesirePosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Task_78 obj = new Task_78();
		for(int i = 0 ; i<size;i++) {
			obj.insertBeg(sc.nextInt());
		}
		
		System.out.println("---Display---");
		obj.display();
		obj.update(10, 1);
		System.out.println("---Updated---");
		obj.display();
	}
	

}
