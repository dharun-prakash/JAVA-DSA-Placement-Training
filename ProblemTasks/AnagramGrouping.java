package ProblemTasks;
import java.util.*;

public class AnagramGrouping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,List<String>> map = new HashMap<>();
		int size = sc.nextInt();
		sc.nextLine();
		String a[] = new String[size];
		for(int i = 0 ; i <size;i++) {
			a[i] = sc.nextLine();
		}
		for(int i = 0 ; i <size;i++) {
			String temp = a[i];
			char ch[] = temp.toCharArray();
			Arrays.sort(ch);
			String sorted = new String(ch);
			if(!map.containsKey(sorted)) {
				map.put(sorted, new ArrayList<>());
			}
			map.get(sorted).add(temp);
		}
		
		System.out.print(map);
	}

}
