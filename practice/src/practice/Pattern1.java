package practice;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	for(int i = 1; i <= n; i++) {
		for(int j = 1; i<= 2*(n-i); i++) {
			System.out.print(" ");
		}
		for(int j = 1; j <= n-1; j--) {
			System.out.print("*");
		}
		
		System.out.println();
	}
			
	}
		
}
