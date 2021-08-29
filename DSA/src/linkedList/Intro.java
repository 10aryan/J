package linkedList;
import java.util.*;
public class Intro {
	public static void main(String[] args) {
//		List<Integer> ll = new LinkedList<>();
//		ll.add(1243);
//		ll.add(123);
//		ll.add(123);
//		ll.add(1322);
//		ll.add(1);
//		
		/*add(Element)
		 * addAll(collection)
		 * get(index)
		 * set(index,value)
		 * remove(index)
		 * removeAll()
		 *clear( )
		 *size()
		 *contains()
		 *isEmpty()
		 *toArray()
		 */
//		ll.toArray();
//		System.out.println(ll);
//		System.out.println(ll.get(1));
//		List<Integer> ll = new LinkedList<>();
//		List<Integer> al = new ArrayList<>();
//		getTimeDiff(al);
//		getTimeDiff(ll);
//		
//	}
//	static void getTimeDiff(List<Integer> list) {
//		long start = System.currentTimeMillis();
//		for(int i = 0;i<100000;i++) {
//			list.add(0,i);
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(list.getClass().getName() +"--> "+(end - start) );
//	}


MyLinkedList<String> myll = new MyLinkedList();
for(int i = 0;i<10;i++) {
myll.add(i+"added ");
}
myll.print();
	}
}