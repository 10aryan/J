package arrays;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int a[][] = {{1,2,3}, {1,3,5}, {1,2,3}};
//		int b[][] = {{2,2,3}, {1,3,1}, {1,2,2}};
//				
//		System.out.println("The multiplication of given matrix");
//		
//		int c[][] = new int[3][3];
//		
//		for(int i= 0; i<3; i++) {
//			for(int j = 0; j<3; j++) {
//				c[i][j] = 0;
//				for(int k=0; k<3; k++) {
//				c[i][j] += a[i][k]*b[k][j];
//			
//			}
//				System.out.print(c[i][j]+"      ");
//			
//		}
//			System.out.println();		
//	}
		int a[][]={{1,2,3}, {1,3,5}, {1,2,3}};    
		int b[][]={{2,2,3}, {1,3,1}, {1,2,2}};    
		    
		//creating another matrix to store the multiplication of two matrices    
		int c[][]=new int[3][3];  //3 rows and 3 columns  
		    
		//multiplying and printing multiplication of 2 matrices    
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=0;      
		for(int k=0;k<3;k++)      
		{      
		c[i][j]+=a[i][k]*b[k][j];      
		}//end of k loop  
		System.out.print(c[i][j]+" ");  //printing matrix element  
		}//end of j loop  
		System.out.println();

}
}
}
