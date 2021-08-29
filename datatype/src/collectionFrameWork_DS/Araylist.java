package collectionFrameWork_DS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Araylist {

	public static void main(String[] args) {
		
//ArrayList<String> fruits = new ArrayList();
		
		List<String> fruits = new LinkedList<>();
		List<String> vegetables = new ArrayList<>();
fruits.add("Apple");
 fruits.add("Orange");
fruits.add("Apple");

//vegetables.add("Potato");
//vegetables.add("Carrot");


// 	System.out.println(fruits.get(1)); // get(index) = to get the indexed value

//fruits.set(1,"Banana");
//System.out.println(fruits);

// fruits.add("Hello"); // to add the "Value"


//System.out.println(fruits);
//		Double x = 45.0; 
//		Pair<String, Integer> p1 = new Pair("Anuj",44);

//	fruits.addAll(vegetables); // addAll() - to add all objects
// System.out.println(fruits);

//fruits.remove(2); // to remove the indexed elements.. 		           	 
//System.out.println(fruits);

//fruits.clear(); // to clear all the elemets in the fruits
//System.out.println(fruits);

//List<String> toRemove =   new ArrayList();
//toRemove.add("Apple");
//fruits.removeAll(toRemove);;

// System.out.println(fruits.size());// to find the size of arraylist

// System.out.println(fruits.contains("guava")); // to find elements are given in the object or not

String temp[] = new String[fruits.size()];
fruits.toArray(temp);
}
}