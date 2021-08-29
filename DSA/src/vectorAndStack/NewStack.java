package vectorAndStack;
import java.util.Stack;

import vectorAndStacks.MyStack;
public class NewStack {

	public static void main(String[] args) throws Exception {
	MyStack<Integer> stack = new MyStack<>();
	stack.push(12);
	stack.push(24);
	stack.push(23);
	int popped = stack.pop();
	
	System.out.println(popped);
	
	int peeked = stack.peek();
	System.out.println(peeked);
	}

}
