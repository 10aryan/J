package practice;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int base;
		int power; 
		int result = 0;
		System.out.println(" Enter the base no. ");
		base = sc.nextInt();
		
		System.out.println(" Enter the Power ");
		power = sc.nextInt();
		
		
		for(int i = 1; i <= power; i++ ) {
			result *= base;
			
			
		}
		System.out.println("Result:" + result);
		
		

	}

}
