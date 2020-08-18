package vectorsAndStack;

import linkedList.MyLinkedList;

public class MyStack<E> {
	
	private MyLinkedList<E> ll=new MyLinkedList<>();
	
	void Push(E e) {
		ll.add(e);
	}
	
	E pop() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("EmptyStackException, popping from empty stack is not allowed.");
		}
		 	return ll.removeLast();
	}
	
	E peek() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("EmptyStackException, peeking from empty stack is not possible.");
		}
		return ll.getLast();
	}
}
