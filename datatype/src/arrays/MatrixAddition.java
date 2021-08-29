package arrays;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
//		System.out.println("enter dimension:");
		
//		int rows = sc.nextInt();
//		int cols = sc.nextInt();
//		
//		System.out.println("enter array a:");
//		
//		int a[][] = new int[rows][cols];
//		int b[][] = new int[rows][cols];
//		
//		for(int i = 0; i<rows; i++) {
//			for(int j = 0; j<cols; j++) {
//				a[i][j] = sc.nextInt();				
//			}
//		}
//		System.out.println("enter array b:");
//		
//		for(int i = 0; i<rows; i++) {
//			for(int j = 0; j<cols; j++) {
//				b[i][j] = sc.nextInt();
//			}
//		}
//		int c[] [] = new int[rows][cols];
//		for(int i = 0; i<rows; i++) {
//			for(int j = 0; j<cols; j++) {
//				c[i][j] = a[i][j] + b[i][j];
//			}
//		}
//		System.out.println("result aray c:");
//		for(int i = 0; i<rows; i++) {
//			for(int j = 0; j<cols; j++) {
//				System.out.println(c[i][j] +" " );
//			}
//			System.out.println();
//		}

		int a[][] = new int [3][3] ;
		int b[][] = new int [3][3];
		System.out.println("Enter first Matrix");
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter second matrix");
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				b[i][j] = sc.nextInt();
				
			}
		}
		int c[][]=new int[3][3];
		
		for(int i = 0; i<3;i++){
		for(int j = 0; j<3;j++){
				 c[i][j] = a[i][j] + b[i][j];
				 System.out.print(c[i][j] +" ");
		
			}
			System.out.println();
		}
		
		
		
	}

}
