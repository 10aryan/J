package ararypractice;

public class Anagram1 {

	public static void main(String[] args) {
		
		String a = "Santosh";
		String b = "hsotnaS";
		
		boolean isAnagram = false;
		boolean visited[] = new boolean [b.length()];
		if(a.length() == b.length()) {
		
		for(int i = 0; i<a.length(); i++) {
		char c = a.charAt(i);
		isAnagram = true;
		for(int j = 0; j<b.length(); j++) {
			if(b.charAt(j) == c && !visited[j]){
				
			visited[j] = true;	
				isAnagram = true;
				break;
				
			}
			
		}
			if(!isAnagram) {
				break;
			}
			
		}
			if(isAnagram) {
				System.out.println("Given String is Anagram ");
			}else {
				System.out.println("Given String is not Anagram");
			}
		}	
		
		
	}

}
