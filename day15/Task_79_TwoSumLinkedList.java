package day15;

class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}

class Task_79{
	Node head = null;
	void insert(int d) {
		Node new_node = new Node(d);
		if(head==null) {
			head= new_node;
		}else {
			new_node.next = head;
			head = new_node;
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
	
	void twosum(int target) {
		Node current = head;
		int pos_1 =0;
		
		while(current!=null){
			int pos_2 = pos_1+1;
			Node temp = current.next;
		while(temp!=null) {
			int sum = current.data + temp.data;
		if(sum == target) {
			System.out.println("Sum "+sum);
			System.out.println("ADDING "+current.data + " "+ temp.data);
			System.out.println("POSITION "+pos_1 + " " + pos_2);
			return;
		}
		temp = temp.next;
		pos_2++;
		}
		current = current.next;
		pos_1++;
		}
		System.out.println(-1);
	}
}

public class Task_79_TwoSumLinkedList {
	public static void main(String[] args) {
		Task_79 obj = new Task_79();
		obj.insert(50);
		obj.insert(70);
		obj.insert(20);
		obj.insert(40);
		obj.insert(30);
		obj.display();
		obj.twosum(1000);
	}

}
