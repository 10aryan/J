package ararypractice;

public class BalanceTheSumOfArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		int n = arr.length;
		int sum1= 0;
		int sum2 = 0;
		for(int i = 0; i<n/2; i++) {
			sum1 = sum1 + arr[i];
			
		}
		for(int i =n/2; i <n; i++) {
			sum2= sum2 + arr[i];
		}
		int sum = sum2-sum1;
		System.out.println("Required numeber is "+ sum);

	}

}
