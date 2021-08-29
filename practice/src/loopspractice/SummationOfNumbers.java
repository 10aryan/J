package loopspractice;
import java.util.Scanner;
public class SummationOfNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while(n <= 10) {
			sum = sum + n;
			n++;
		}
				
		System.out.println("summation: " + sum);
			
	}

}
