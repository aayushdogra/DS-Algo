package vectorsAndStack;

//import java.util.*;

public class MainClass {

	public static void main(String[] args) throws Exception {
		
		MyStack<Integer> stack=new MyStack<>();
		
		stack.Push(10);
		stack.Push(20);
		stack.Push(30);
		
		int popped=stack.pop();
		System.out.println(popped);
		
		int peeked=stack.peek();
		System.out.println(peeked);
		
		
//		Stack<Integer> stack=new Stack<>();
//		
//		stack.push(10);
//		stack.push(20);
//		stack.push(30);
//		
//		int popped=stack.pop();
//		System.out.println("element popped: "+popped);
//		
//		popped=stack.pop();
//		System.out.println("element popped: "+popped);
//		
//		System.out.println("current elements in stack: "+stack);
//		
//		int peeked=stack.peek();
//		System.out.println("element at top position: "+peeked);
		
		
//		Vector<Integer> v=new Vector<>();
//		v.add(10);
//		v.add(20);
//		v.add(30);
//		v.add(40);
//		v.add(50);
//		System.out.println(v);

	}

}
