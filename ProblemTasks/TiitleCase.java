package ProblemTasks;
import java.util.Scanner;

public class TiitleCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		word = word.toLowerCase();
		String a[] = word.trim().split(" ");
		for(int i = 0 ; i <a.length;i++) {
			String temp = a[i];
			char arr[] = temp.toCharArray();
//			System.out.println(temp);
			arr[0] = Character.toUpperCase(arr[0]);
//			System.out.println(arr[0]);
			for(int k = 0 ;k< arr.length;k++) {
				System.out.print(arr[k]);
			}
			System.out.print(" ");
		}
	}

}
