package ProblemTasks;
import java.util.*;

public class Buy2Get2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int items[] = new int[size];
		for(int i = 0;i<size;i++) {
			items[i] = sc.nextInt();
		}
		Arrays.sort(items);
		for(int i : items) {
			System.out.print(i+ " ");
		}
		sc.nextLine();
		String inp = sc.nextLine();
		char[] inpArr = inp.toCharArray();
 		int buy = 0;
		int get = 0;
		for(int i = 0;i<inpArr.length;i++) {
			if(Character.isDigit(inp.charAt(i))){
				if(buy==0) {
				buy = inpArr[i] - '0';
				}
				else if(get==0) {
					get = inpArr[i] - '0';
				}
			}
		}
		System.out.println(buy);
		System.out.println(get);
 
		int totalBill = 0;
		int count = 0;
		int countGet = 0;
		for(int i = size-1 ; i>=0;i--) {
//			if(count != buy) {
//				totalBill+=items[i];
////				System.out.println("Bill "+totalBill);
//				count++;
//				countGet = 0;
//			}else if(count == buy && countGet>=get){
//				count = 0;
//				countGet++;
//				continue;
//			}
			if(count == buy) {
				i-=get;
				count = 0;
				continue;
			}else {
				totalBill+=items[i];
				count++;
				i--;
			}
		}
		System.out.print(totalBill );
	}

}
