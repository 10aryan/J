package ararypractice;

import java.util.Arrays;

class equalOrNot{
		public static boolean areEqual(int arr1[], int arr2[]){
			
			 	int a = arr1.length;
			 	int b = arr2.length;
			 	if(a != b) 
			 		return false;
			 		Arrays.sort(arr1);
			 		Arrays.sort(arr2);
			 		for(int i = 0; i<a; i++) 
			 			if(arr1[i] != arr2[i]) 
			 				return false;
			 				return true; // if elements were same
			 				
			 		
				
			
		}
	

	
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4};
	int arr2[] = {1,2,3,4};
	if(areEqual(arr1, arr2))
		System.out.println(" YES ");
	else 
		System.out.println(" No ");
		
		
	}
}
	
	 

