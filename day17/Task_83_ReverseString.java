package day17;
import java.util.ArrayList;
import java.util.Scanner;

public class Task_83_ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<>();
		ArrayList<String> reversed = new ArrayList<>();
		int size = sc.nextInt();
		for(int i= 1 ; i<=size;i++) {
			a.add(sc.next());
		}
		System.out.println("Orginal : "+a);
        for (String word : a) {
            String rev = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                rev += word.charAt(i);
            }
            reversed.add(rev);
        }
        System.out.print("reverse : "+reversed);
	}

}
