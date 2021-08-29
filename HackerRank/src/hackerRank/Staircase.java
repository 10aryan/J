package hackerRank;
import java.util.*;

public class Staircase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numInputs = sc.nextInt();
		//		int i,j;
//		int n = sc.nextInt();
//		for(i = 0;i<n;i++) {
//			for(j = 0;j<n-1;j++) {
//			System.out.println(" ");
//			}
//		
//		for(int k = 0;k<i+1;i++) {
//			
//			System.out.println("#");
//			
//			}
//System.out.println(" ");
//		}

        for(int i = 1; i <= numInputs; i++){ // rows
            
            int j = numInputs;
            
            // loop to print (size - i) spaces
            while(j-- > i) {
                System.out.print(" ");
            }
            // loop to print (i) #s
            while(j-- >= 0) {
                System.out.print("#");
            }
            
            System.out.println();
        }
        

		}

}
