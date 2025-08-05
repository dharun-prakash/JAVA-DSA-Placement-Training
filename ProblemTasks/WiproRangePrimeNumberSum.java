package ProblemTasks;
import java.util.Scanner;

public class WiproRangePrimeNumberSum {
	
	static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i = 2 ; i <=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int i = 0 ; i < size ; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Range");
		int range = sc.nextInt();
		System.out.println("n");
		int n = sc.nextInt();
		int count = 0;
		int val = 0;
		if(range!=0 && range > n) {
		for(int i=2;i<=range;i++) {
			if(isPrime(i)) {
				count++;
				System.out.println("Prime "+i);
			}
			if(count == n) {
				val = i;
//				System.out.println("Val"+val);
				break;
			}
		}
		
		for(int i = 0 ; i<size;i++) {
			a[i]=a[i]+val;
			System.out.print(a[i] + " ");
		}
		}else {
			System.out.print(0);
		}
		
		
	}

}
