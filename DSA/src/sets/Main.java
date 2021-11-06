package sets;
import java.util.*;

public class Main {

	public static void main(String[] args) {
/*
		 *  add(element)
		 * addAll(Collection)
		 *remove(element)
		 * removeAll()
		 * retainAll()
		 * clear()
		 * size()
		 * contains()
		 * containsAll()
		 * isEmpty()
		 * toArray()
*/
	
		Set<String> fruits = new HashSet<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("orange");
		fruits.add("Watermelon");
		System.out.println(fruits.add("Watermelon"));
		System.out.println(fruits.add("Banana"));
		System.out.println(fruits); 	
		Set<String> fruits2 = new HashSet<>();
		fruits2.add("Guava");
		fruits.add("mangoes");
		System.out.println(fruits.containsAll(fruits2));
		System.out.println(fruits);
	}

}
