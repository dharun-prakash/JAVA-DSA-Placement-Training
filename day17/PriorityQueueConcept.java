package day17;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueConcept {
	public static void main(){
		PriorityQueue <Integer> o = new PriorityQueue<>();
		o.add(10);
		o.add(20);
		o.add(30);
		o.add(40);
		Iterator<Integer> it = o.iterator();;
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
	}

}
