package day17;
import java.util.ArrayList;
import java.util.Scanner;

public class Task_84_MoveZeroToEnd {
	
	static void array() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int j= 0;
		int arr[] = new int[size];
		for(int i = 0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int arr1[] = new int[size];
		for(int i = 0 ; i<size;i++) {
			if(arr[i]!=0) {
				arr1[j]=arr[i];
				j++;
			}
		}
		for(int i : arr1) {
			System.out.print(i);
		}
		
	}
	
	static void arraylist() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		int size = sc.nextInt();
		for(int i = 0;i<size;i++) {
			a.add(sc.nextInt());
		}
		for(int i : a) {
			if(i!=0) {
				b.add(i);
			}
		}
		for(int i : a) {
			if(i==0) {
				b.add(i);
			}
		}
		for(int i :a) {
			System.out.print(i);
		}
		System.out.println("Second array ");
		for(int i :b) {
			System.out.print(i);
		}
	}
	
	static void arrayMethod2() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int temp;
		int a[] = new int[size];
		for(int i = 0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			for(int j =i+1;j<size;j++) {
				if(a[i]!=0) {
				 continue;
				}
				if(a[i]==0) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i :a) {
			System.out.print(i);
		}
		
	}
	
	static void arraylist2() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		int size = sc.nextInt();
		for(int i = 0;i<size;i++) {
			a.add(sc.nextInt());
		}
		for(int i = 0;i<size;i++) {
			if(a.get(i)!=0) {
				b.add(a.get(i));
			}
		}
		for(int i = 0;i<size;i++) {
			if(a.get(i)==0) {
				b.add(a.get(i));
			}
		}
			System.out.print(b);
		
		
	}

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
//		array();
//		arraylist();
		arraylist2();
//		arrayMethod2();

	}

}
