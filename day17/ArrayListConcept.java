package day17;

import java.util.ArrayList;

public class ArrayListConcept {
	public static void main(String[] args) {
		ArrayList<Object> obj = new ArrayList<>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(0, 1);
		obj.set(4, 1000);
		obj.remove(4);
		obj.add("Hi");
//		obj.remove("Hi");
//		obj.clear();
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.isEmpty());
		System.out.println(obj.contains("Hi"));
		for(Object i:obj) {
			System.out.print(i + " ");
		}
		for(int i = 0 ; i < obj.size();i++) {
//			System.out.println(obj[i]);
		}
		
		
	}
}
