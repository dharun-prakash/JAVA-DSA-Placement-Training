package day16;

//class A {
//    A() {
//        System.out.println("A Constructor");
//    }
//}
//
//class B extends A {
//    B() {
//        System.out.println("B Constructor");
//    }
//}

class A {
    static void method() {
        System.out.println("Static A");
    }
}
class B extends A {
    static void method() {
        System.out.println("Static B");
    }
}
public class Assesment_3 {
    public static void main(String[] args) {
//        B obj = new B();
//        A obj = new B();
//        obj.method();
//    	System.out.println(5+"2"+3);
//    	Integer a = 128;
//    	Integer b = 128;
//    	int num = 30;
//    	for(int i = 2 ; i <=num;i++) {
//    		while(num%i==0) {
//    			System.out.print(i);
//        		num/=i;
//    		}
//
//    	}
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    	
    	
    }

}
