package queue;

public class MyQueue<E> {
	
	static class Node<E>{
		 E data;
		 Node<E> next;
		
		public Node(E data) {
			this.data=data;
			next=null; 
		}
	}
	
	private Node<E> head, rear;
	
	public void enqueue(E e) {
		Node<E> toAdd=new Node<E>(e);
		
		if(head==null) {
			head=rear=toAdd;
			return;
		}
		
		rear.next=toAdd;
		rear=rear.next;
	}
	
	public E dequeue() {
		
		if(head==null) {
			return null;
		}
		Node<E> temp=head;
		head=head.next;
		
		if(head==null) {
			rear=null;
		}
		
		return temp.data;
		
	}
	
	public E peek() {
		if(head==null) {
			return null;
		}
		Node<E> temp=head;
		return temp.data;
	}
}
