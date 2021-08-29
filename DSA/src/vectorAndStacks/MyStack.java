package vectorAndStacks;
import linkedList.MyLinkedList;
public class MyStack<E> {

	private MyLinkedList ll = new MyLinkedList();
	public void push(E e) {
		ll.add(e);
	}
	public E pop() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("Popping from emptyy stack is not allowed");	
		}
		
		return (E) ll.removeLast();
	}
	
	public E peek() throws  Exception{
		if(ll.isEmpty()) {
			throw new Exception("Peeking from empty stack is not allowed");
		}
		
		return (E) ll.getLast();
	}
}
