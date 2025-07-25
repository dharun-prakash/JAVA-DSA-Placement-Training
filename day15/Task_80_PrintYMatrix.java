package day15;
import java.util.Scanner;

public class Task_80_PrintYMatrix {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int sum = 0;
	int b[][] = new int[size][size];
	for(int i = 0;i<size;i++) {
		for(int j = 0;j<size;j++) {
		b[i][j] = sc.nextInt();
		}
	}
	for(int i = 0;i<size;i++) {
		for(int j = 0;j<size;j++) {
		System.out.print(b[i][j] + " ");
		if ( i +j == size-1 || i == j && i<=j%2 ) {
			sum += b[i][j];
		}
		}
		System.out.println();

	}
	System.out.println(sum);
	
}

}
