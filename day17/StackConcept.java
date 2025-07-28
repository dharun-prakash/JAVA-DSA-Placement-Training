package day17;
import java.util.*;

public class StackConcept {
	public static void main(String[] args) {
		Stack<Integer> a = new Stack<>();
		a.push(10);
		a.push(20);
		a.push(30);
		a.pop();
		System.out.println(a.peek());
		System.out.println(a.isEmpty());
		System.out.println(a);
	}

}
