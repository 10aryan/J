package practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		int fact = 1;
		System.out.println("Factorial of: ");
		n = sc.nextInt();
		
		for(int i = 1; i<= n; i++) {
			fact *= i;
			
		}
		System.out.println(" factorial " +fact);
		
	}

}
