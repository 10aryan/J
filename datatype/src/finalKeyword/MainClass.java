package finalKeyword;

public class MainClass extends Student {
//	public void getDescription() {        // we can not override a method after using final keyword in parent class 
//		System.out.println("Inside the main class");
//	}
//	
// final int  ROLL_NO =4; // use CAPITAL words in and _ sign for final keyword that it can be easy to find

	public static void main(String[] args) {
//	final Student obj  = new Student();
//	Student obj2 = new Student();
//	obj.name = "santosh";
MainClass obj = new MainClass();
		obj.getDescription();
	}

}
