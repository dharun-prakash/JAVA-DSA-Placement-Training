package day17;
import java.util.*;

public class Task_85_DeleteTheDuplicates {
	
	static void method() {
		ArrayList<Integer> a = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int temp = 0;
		int j =1;
		for(int i = 0;i <size;i++) {
			a.add(sc.nextInt());
		}
		for(int i=0;i<size;i++){
			boolean isseen = false;
			for(int j=0;j<i;j++) {
				if(a.get(i).equals(a.get(j))) {
					isseen = true;
					break;
				}
			}
			if(!isseen) {
				System.out.print(a.get(i)+ " ");
				}
			
		}

	
	}
	
	static void method2() {
		LinkedHashSet<Integer> a = new LinkedHashSet<>();
		a.add(10);
		a.add(10);
		a.add(20);
		a.add(20);
		System.out.print(a);
	}
	public static void main(String[] args) {
		method2();
	}

}
