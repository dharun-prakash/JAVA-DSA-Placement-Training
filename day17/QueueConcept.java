package day17;
import java.util.Queue;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.LinkedList;


public class QueueConcept {
	
	static void QueueLinkedList(){
		Queue<Integer> a = new LinkedList<>();
		a.add(10);
		a.add(20);
		a.add(30);
//		a.clear();
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		QueueLinkedList();
		
	}

}
