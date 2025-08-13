package ProblemTasks;

import java.util.Scanner;

public class ArrayPalindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int i = 0 ; i <size;i++) {
			a[i] = sc.nextInt();
		}
		int left = 0;
		int right = a.length-1;
		while(left<right) {
			if(a[left] != a[right]) {
				System.out.print("Not a Palindrome");
				return;
			}
			left++;
			right--;
		}
		System.out.print("Palindrome");
	}

}
