package loopspractice;
import java.util.Scanner;
public class PrintTheMultiplicationTableOfThatNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter a positive number");
		
		System.out.println("Multilication of table " + n );
		
		for(int i = 1; i<= 10; i++) {
			System.out.println(n +"x "+ i + "= "+ (n*i) );
		}

	}

}
