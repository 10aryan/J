package hackerRank;
import java.util.*;

public class StaticInitilizer {

	public static int addition = staticinitilizer(1,2);
	
	
	public static void main(String[] args) {
System.out.println(addition);
	
//	Scanner sc = new Scanner(System.in);
//	int i = sc.nextInt();

	}

	private static int staticinitilizer(int a,int b) {
			int sum = a +b;
		return sum;
	}



}
