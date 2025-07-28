package day17;
import java.util.ArrayList;

public class Task_82_FindEvenInArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> a= new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		for(Integer i:a) {
			if(i%2==0) {
				System.out.println(i + " Even");
			}else {
				System.out.println(i + " Odd");
			}
		}
	}

}
