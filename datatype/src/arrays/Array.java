package arrays;

import java.util.Scanner;

public class Array {
	
public static void array(int num) {
	
	

}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrayLength = sc.nextInt();
		int ar[] = new int[arrayLength];
		System.out.println("Enter the element to print the array: ");
		for(int i = 0; i <arrayLength; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("Given array: ");
		for(int a: ar)
		System.out.print(a +" ");
	}

}
