package day13;

class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}

class InsertEndList{
	Node head = null;
	void insertend(int d) {
		Node new_node = new Node(d);
		if(head ==null) {
			head=new_node;
		}else {
			Node temp = head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=new_node;
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
		Node temp = head;
		if(head==null) {
			System.out.print("Empty");
			return;
		}
		else if(temp.next == null) {
			head = null;
		}
		else {
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		}
	}
}

public class SInglelyLinedListInsertEnd {
	public static void main(String[] args) {
		InsertEndList obj = new InsertEndList();
		obj.insertend(10);
		obj.insertend(20);
		obj.insertend(30);
		obj.display();
		System.out.println();
		System.out.println("-----------");
		obj.delete();
		obj.delete();
		obj.delete();
		obj.delete();
		obj.display();
		
	}

}
