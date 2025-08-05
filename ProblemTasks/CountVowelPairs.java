package ProblemTasks;
import java.util.Scanner;

public class CountVowelPairs {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String word = sc.nextLine();
	        char a[] = word.toCharArray();
	        char vowels[] = {'a','e','i','o','u'};
	        int pair = 0;

	        for(int i = 0 ; i<a.length-1;i++){
	        	
		        boolean first = false;
		        boolean second = false;
	        	
	            for(int j = 0 ;j<vowels.length;j++){
	                if(a[i]==vowels[j]){
	                	first = true;
	         
	                }
	                if(a[i+1]==vowels[j]) {
	                	second = true;
	                }
	            }
	            if(first && second) {
	            	pair++;

	            }
	        }
	        System.out.print("Number of vowel pairs: "+pair);
	        
	        
	    }

}
