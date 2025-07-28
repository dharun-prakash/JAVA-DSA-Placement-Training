package day17;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.ArrayDeque;

public class ArraydequeConcept {
	public static void main(String[] args) {
			ArrayDeque <Integer> o = new ArrayDeque<>();
			o.add(10);
			o.add(20);
			o.add(30);
			o.add(40);
			o.addFirst(1);
			o.addLast(1);
			Iterator<Integer> it = o.iterator();;
			while(it.hasNext()) {
				
				System.out.println(it.next());
			}
			System.out.println(o.getFirst());
			System.out.println(o.getLast());
	}

}
