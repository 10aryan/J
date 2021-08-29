package bitMasking;

public class FindIthTerm {

	public static void main(String[] args) {
		int n =111101111;
		int i = 3;
		int mask = 1 << i;
		int result = n&mask;
		if(result !=0) {
			System.out.println("Ith position is zero");
		}else {
			System.out.println("Ith postion is 1");
		}

	}

}
