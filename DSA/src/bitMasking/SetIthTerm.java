package bitMasking;

public class SetIthTerm {

	public static void main(String[] args) {
		int n = 10100010;
		int i = 3;
		int mask =1<<i;
		
		System.out.println(n&mask);
	}

}
