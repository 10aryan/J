package hackerRank;
import java.util.Scanner;


public class MatrixDiagonalAddition {

	public static void main(String[] args) {
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of rows");
		
		int rows    = sc.nextInt();
		System.out.println("Enter the numbers of columns");
		
		int column = sc.nextInt();
		int mat[][] = new int[rows][column];
		
		System.out.println("Enter the Values of matrix");
		
		if(rows == column) {
		for(int i = 0;i<rows;i++) {
			for(int j = 0;j<column;j++) {
				mat[i][j] = sc.nextInt();
			}
			
		}
		System.out.println("Given matrix1");
		for(int i = 0;i<rows;i++) {
			for(int j = 0;j<column;j++) {
			 System.out.print(mat[i][j]+"\t");
			}
			System.out.println(" ");
		}
		

		for(int i=0;i<rows;i++)
		{ 
    		for(int j=0;j<column;j++)
    		{ 
    			if(i == j) {
    				sum = sum+mat[i][j];
    			}
    		}
		}
		System.out.println("Sum of the diagonal elements of a given matrix ="+sum)	;
		}
	}

}
