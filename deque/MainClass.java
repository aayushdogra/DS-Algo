package deque;

import java.util.ArrayDeque;

public class MainClass {
	
	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		
		ad.push(10);
		ad.push(20);
		ad.push(30);
		ad.push(40);
		ad.push(50);
		System.out.println(ad);
		
		System.out.println(ad.pop());
		System.out.println(ad.peek());
//		ad.addFirst(10);
//		ad.addFirst(20);
//		ad.addFirst(30);
//		ad.addFirst(40);
//		
//		System.out.println(ad);
//		
//		System.out.println(ad.pop());
//		System.out.println(ad.peek());
	}

}
