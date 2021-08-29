
/*QUEUE
 * methods of queue
 * exception thrower 
 *add()
 * remove()
 * element()
 * Return False/null
 * offer()
 * poll()
 * peek()
 */


package queue;
public class MainClass {

	public static void main(String[] args) {
//		Queue<Integer> q = new LinkedList<>();
//		
//		q.add(12);
//		q.add(23);
//		q.add(34);
//		
//		System.out.println(q);
//		System.out.println(q.remove());
//		System.out.println(q.remove());
		
//		System.out.println(q.element());
//		q.remove();
//		System.out.println(q.poll());
	MyQueue<Integer> mq = new MyQueue<>();
	mq.enqueue(1);
	mq.enqueue(2);
	mq.enqueue(3);
	mq.enqueue(4);
	mq.enqueue(5);
	
	
	
	
	mq.enqueue(345);
	System.out.println(mq.peek());
		
	}

}
