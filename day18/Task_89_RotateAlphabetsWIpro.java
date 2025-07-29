package day18;
import java.util.*;

public class Task_89_RotateAlphabetsWIpro {
	
	static void method1(String word,int rot) {
		char ch[] = word.toCharArray();
		for(int i = 0;i<ch.length;i++) {
//			int cast =(int)ch[i];
//			System.out.println(cast);
			if(Character.isUpperCase(ch[i])) {
				ch[i]= (char) ( (ch[i] - 'A'+rot)%26+'A');
			
			}
			else if(Character.isLowerCase(ch[i])) {
				ch[i]= (char) ( (ch[i] - 'a'+rot)%26+'a');
			
			}
			
		}
		
		for(int i = 0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		
	}
	
	static void method2(String word, int rot) {
	    char ch[] = word.toCharArray();
	    for (int i = 0; i < ch.length; i++) {
	        int cast = (int) ch[i] + rot;
	        if (ch[i] >= 'a' && ch[i] <= 'z') {
	            if (cast > 'z') {
	                cast = 'a' + (cast - 'z' - 1);
	            }
	            ch[i] = (char) cast;
	        }
	        else if (ch[i] >= 'A' && ch[i] <= 'Z') {
	            if (cast > 'Z') {
	                cast = 'A' + (cast - 'Z' - 1);
	            }
	            ch[i] = (char) cast;
	        }
	    }
	    for (int i = 0; i < ch.length; i++) {
	        System.out.print(ch[i]);
	    }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int rot = sc.nextInt();
//		method1(word,rot);
		method2(word,rot);

		
	}

}
