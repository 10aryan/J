package string;

public class StringIntro {

	public static void main(String[] args) {
		String cars = "Hyundai, Maruti, Swift";
		String allCars[] = cars.split(",");
//		for(String car: allCars) {
//			System.out.println(car);
//		}
	
			//	String name = "Santosh";
	//	name = name + " Kumar"; // or line 22()
	//	String anotherName = new String("Santosh");;
	
	//	System.out.println(name.charAt(6));	// char charAt(int index value from string)
	//	System.out.println(name.length()) ; // .length for length of a string
	//	System.out.println(name.substring(0, 17));	//substring for (int begenning index) or (beginning index, and int end index )
	//	System.out.println(name.contains("Santosh")); // given value is present in the string or not
	// System.out.println(name.equals(anotherName)); // boolean equals (obejct is same or not)
	//	System.out.println(name.isEmpty()); // isempty or not
	//	System.out.println(name.concat("Morya") );  // add the variable of the string
	//	System.out.println(name.replace('a', 'c')); // replace the character
	//	System.out.println(cars.indexOf('H')); // find the index of character
	//	System.out.println(cars.toLowerCase()); // for upper case (toUpperCase) and for lower case (toLowerCase)
		String name = "        Santosh    ";
		System.out.println(name.trim()); // remove the spaces (trim)
		
	
	}

}
