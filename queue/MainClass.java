package queue;

//import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		MyQueue<Integer> mq=new MyQueue<>();
		
	 mq.enqueue(10);
	 mq.enqueue(20);
	 mq.enqueue(30);
	 System.out.println(mq.dequeue());
	 System.out.println(mq.dequeue());
	 System.out.println(mq.dequeue());
	 System.out.println(mq.dequeue());
	 
	 mq.enqueue(49);
	 mq.enqueue(50);
	 mq.enqueue(60);
	 System.out.println(mq.peek());
		
//		Queue<Integer> q=new LinkedList<>();
		
//		q.remove();
//		System.out.println(q.poll());
//		q.add(10);
//		q.add(20);
//		q.add(30);
//		
//		System.out.println(q);
//		System.out.println(q.remove());
//		System.out.println(q.remove());
//		System.out.println(q.element());
		

	}

}
