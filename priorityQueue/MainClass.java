package priorityQueue;

import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		pq.add(99);
		pq.add(1);
		pq.add(70);
		pq.add(20);
		pq.add(35);
		
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
//		PriorityQueue<String> pq=new PriorityQueue<>();
		
//		pq.add("apple");
//		pq.add("orange");
//		pq.add("mango");
//		pq.add("kiwi");
//		pq.add("banana");
//		System.out.println(pq);
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.element());
	}

}
