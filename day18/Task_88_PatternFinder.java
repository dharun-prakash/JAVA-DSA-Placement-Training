package day18;
import java.util.*;

public class Task_88_PatternFinder {
    public static void main(String[] args) {
        HashMap<String, Character> a = new HashMap<>();
        HashSet<Character> b = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size ");
        int size = sc.nextInt();
        for(int i =0;i<size;i++) {
            System.out.print("Enter "+i);
            a.put(sc.next(), sc.next().charAt(0));
        }

        System.out.println("HashMap: " + a);
        sc.nextLine();
        System.out.println("Enter question no:");
        int ques_size = sc.nextInt();
        String[] ques = new String[ques_size];
        sc.nextLine();
        System.out.println("Enter "+ques_size+" questions:");

        for (int i = 0; i <ques_size ; i++) {
            ques[i] = sc.nextLine();
        }

        char[] pat = new char[ques_size];
        System.out.println("Enter "+ques_size+" pattern :");
        for (int k = 0; k < ques_size; k++) {
            pat[k] = sc.next().charAt(0);
            b.add(pat[k]);
            
        }

        for (int j = 0; j < pat.length; j++) {
            if (a.containsValue(pat[j])) {
                System.out.println(pat[j] + " true");
            } else {
                System.out.println(pat[j] + " false");
            }
        }

    }
}
