package ProblemTasks;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		char arr[] = a.toCharArray();
		char arr1[] = b.toCharArray();
		int count = 0;
		if(arr.length == arr1.length) {
			for(int i = 0; i <arr.length;i++) {
				for(int j = 0 ; j <arr1.length;j++) {
					if(arr[i]==arr1[j]) {
						arr[i] = 0;
						arr1[j] = 0;
					}
					
				}
			}
			for(int i = 0 ; i<arr.length;i++) {
				if(arr[i]==0) {
					count++;
				}
			}
			if(count == arr.length && count == arr1.length) {
				System.out.println("It is Anagram");
			}else {
				System.out.println("Not a Anagram");
			}
		}
		else {
			System.out.println("Not a Anagram");
		}
	}

}
