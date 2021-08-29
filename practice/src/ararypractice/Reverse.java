package ararypractice;

import java.util.Arrays;
import java.util.Collection;

public class Reverse {

	public static void main(String[] args) {
		
		int arr[] = {1,2,4,3};

		int start = 0;
		int end = arr.length-1;
		
		int temp;
		while(start<end) {
		
		temp = arr[start];
		
		arr[start] = arr[end];
		arr[end] = temp;
		start++;
		end--;
		}
		for(int j = 0; j<arr.length; j++) {
			System.out.println(arr[j]);
		}
		
		

}

}