/*
 * operations  				Methods						Methods throwing Exception
 * insertion for head   =  offerFIrst(e)            addFirst(e)
 * removal from Head 	= pollFirst()				removeFirst()
 * Retrieval from Head = peekFirst()				getFirst()
 * Insertion from Tail	= offerLast(e)				addLast(e)
 * 	Remove from tail 	= pollLast()				removeLast()
 * Retrieve from Tail 	= peekLast()				getLast()
 */
package doublyEndedQueue;

import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<>();
//		ad.addFirst(12);
//		ad.addFirst(24);
//		System.out.println(ad.pop());
//		System.out.println(ad.peek());
		ad.push(23);
		ad.push(44);
		ad.push(45);
		
		
		System.out.println(ad.pop());
		System.out.println(ad.pop());
		System.out.println(ad);
	}

}
