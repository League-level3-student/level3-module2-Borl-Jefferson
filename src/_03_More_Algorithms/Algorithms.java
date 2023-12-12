package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
	public static boolean isPrime(int num) {
			for (int j = 2; j <= num/2; j++) {
			if(num%j==0) {
				System.out.println(j);
				return false;
			}
		}
		return true;
	}
	
	
	public static boolean isSquare(int num) {
		for (int j = 0; j <= num; j++) {
			if(Math.sqrt(num)==j) {
				System.out.println(j);
				return true;
			}
		}
		return false;
	}
	
	public static boolean isCube(int num) {
		for (int j = 0; j <= num; j++) {
			if(Math.cbrt(num)==j) {
				System.out.println(j);
				return true;
			}
		}
		return false;
	}
	
    public static String multiply(int num1, int num2) {
       String value = num1 + " x " + num2 + " = " + num1*num2;
    	return value;
    }
//    
//    public static int findBrokenEgg(List<String> eggs) {
//        return 0;
//    }
}
