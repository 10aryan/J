package twoPointersAlgo;

import java.util.Arrays;

public class Findtripet {

	public static void main(String[] args) {
		int arr[]= {1,2,3,-5,5};
		int n = arr.length;
		Arrays.sort(arr);
		for(int i = 0; i<n-2;i++) {
			
		}
		
	}
	public boolean twoSum(int a[],int x, int i) {
		
		
		int j= a.length-1;
		while(i<j) {
			if(a[i]+ a[j]>x) {
				j--;
			}else if(a[i] +a[j]<x) {
				i++;
			}else {
				return true;
			}
		}
		return false;
	}

}
