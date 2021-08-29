package ararypractice;


public class CountZero {
	

	public static void main(String[] args) {
		int arr[] = {1,2,0,0,7,0};
		int n = arr.length;
		int cnt =0;
		for(int c: arr) {
			if(c == 0) {
			++cnt;
			}
		}
		System.out.println(cnt);
	}

}
