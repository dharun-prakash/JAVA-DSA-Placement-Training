package day17;
import java.util.*;

public class Task_86_MergeSortLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<Integer> a = new LinkedHashSet<>();
		LinkedHashSet<Integer> b = new LinkedHashSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("1st size");
		int size = sc.nextInt();
		System.out.print("1st elements");
		for(int i = 0 ; i <size;i++) {
			a.add(sc.nextInt());
		}
		System.out.print("2nd size");
		int size_1 = sc.nextInt();
		System.out.print("2nd elements");
		for(int i = 0 ; i <size_1;i++) {
			b.add(sc.nextInt());
		}
		HashSet<Integer> c = new HashSet<>();
		for(int i:a) {
			c.add(i);
		}
		for(int i:b) {
			c.add(i);
		}
		System.out.print(c);
		
	}

}
