package day18;
import java.util.*;
public class Task_87_VowelReplace {
	public static void main(String[] args) {
		char a[]= {'a','e','i','o','u','a','A','E','I','O','U','A'};
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
//		System.out.print(a);
		char ch[] = word.toCharArray();
		for(int i= 0 ; i<ch.length;i++) {
			for(int j = 0 ; j<a.length-1;j++) {
				if(ch[i]==a[j] ) {
					ch[i]=a[j+1];
					break;
				}
			}
		}
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
	}

}
