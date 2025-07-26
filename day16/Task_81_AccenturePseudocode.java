package day16;

public class Task_81_AccenturePseudocode {
	static void funt(int k) {
		if(k>155) {
			return;
		}
		System.out.println(k );
		funt(k+2);
		System.out.println(k);
	}
	public static void main(String[] args) {
		funt(150);
	}

}
