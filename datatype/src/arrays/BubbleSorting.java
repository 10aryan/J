package arrays;
public class BubbleSorting {

	public static void main(String[] args) {
//		int a[] = {2, 23, -3, 23, 6, 7};
//		int n = a.length;
//		for(int i = 0; i<n-1; i++) {
//			for(int j = 0; j<n-1; j++) {
//				if(a[j+1] < a[j]) {
//					int temp = a[j+1];
//					a[j+1] = temp;			
//				}
//			}
//		}
			int a[] = {2, 3, 4, -2, 4 };
			int n = a.length;
			for(int i = 0; i<n-1; i++) {
			for(int j = 0; j<n-1; j++) {
				if(a[j+1] < a[j]) {
					int temp  = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					}
				}		
			}
			for(int item: a ) {
				System.out.print(item + " ");	 
		}
	} 
}