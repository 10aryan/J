package queue;

import java.util.PriorityQueue;

public class priorityQueue {

	public static void main(String[] args) {
//		PriorityQueue<String> pq = new PriorityQueue<>();
//		pq.add("Apple");
//		pq.add("Banana");
//		pq.add("Kiwi");
//		pq.add("orange");
//		System.out.println(pq);
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.getClass().getSimpleName());
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(34);
		pq.add(23);
		pq.add(3);
		pq.add(24);
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
		

	}

}
