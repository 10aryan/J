package practice;
import java.util.Scanner;

public class JavaPratice {
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Input numbers:");
		int input = in.nextInt();
		if (input> 0)
		{
			System.out.println("Numbers is positive ");
			
		}
		else if (input< 0)
		{ 
			System.out.println("Numbers is negative");
			}
		else
		{
			System.out.println("Numbers is zero");
		}

}
}					