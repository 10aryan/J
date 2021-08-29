package ararypractice;

public class SimpleMAtrix {

	public static void main(String[] args) {
	
		 // declaring and initializing 2D array 
//        int arr[][] = { {2,7,9},{3,6,1},{7,4,2} }; 
//  
//        // printing 2D array 
//        for (int i=0; i< 3 ; i++) 
//        { 
//            for (int j=0; j < 3 ; j++) 
//                System.out.print(arr[i][j] + " "); 
//  
//            System.out.println(); 
//        } 

		int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
		int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
		    
		//creating another matrix to store the sum of two matrices    
		int c[][]=new int[3][3];  //3 rows and 3 columns  
		    
		//adding and printing addition of 2 matrices    
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
		System.out.print(c[i][j]+" ");    
		}    
		System.out.println();//
		}
	}
}
