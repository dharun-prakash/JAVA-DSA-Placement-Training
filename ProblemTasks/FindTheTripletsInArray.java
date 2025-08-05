package ProblemTasks;
import java.util.Scanner;



public class FindTheTripletsInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		int temp = 0;
		int count = 0;
		for(int i = 0 ; i <size ; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0;i<size;i++) {
			for(int j = i+1;j<size;j++) {
				temp = a[i]+a[j];
				for(int k = 0 ; k <size;k++) {
					if(temp == a[k]) {
						count++;
					}
				}
			}
		}
		
		System.out.print("Tripletes "+ count);
	}

}
