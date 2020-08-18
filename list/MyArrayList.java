package list;

import java.util.LinkedList;
//import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		List<String> fruits=new LinkedList<>();
//		List<String> vegetables=new LinkedList<>();
		fruits.add("Apple");
		fruits.add("Bannana");
		fruits.add("Orange");
//		String temp[]=new String[fruits.size()];
//		fruits.toArray(temp);
//		for(String s: temp) {
//			System.out.println(s);
//		}
//		System.out.println(fruits.isEmpty());
		fruits.set(1, "Cherry");
//		fruits.remove(1);
		
//		List<String> toRemove=new ArrayList<>();
//		toRemove.add("Apple");
//		toRemove.add("Orange");
//		fruits.removeAll(toRemove);
//		fruits.clear();
//		System.out.println(fruits.contains("Apple"));
		System.out.println(fruits);
		
//		System.out.println(fruits.get(1));
		
//		vegetables.add("Potato, Cabbage, Cauliflower, Onion");
//		fruits.addAll(vegetables);
//		System.out.println(fruits);
		
		
		
		
		//		ArrayList<String> fruits=new ArrayList<>();
//		fruits.add("Apple, Bannana, Mango, Grapes, Kiwi, Melon, Cherry, Orange, Guava");
////		fruits.add(23);
//		System.out.println(fruits);
//
//		Pair<String, Integer> p1=new Pair<>("Aayush", 24);
//		Pair<Boolean, String> p2=new Pair<>(true, "Hello");
//		p1.getDescription();
//		p2.getDescription();
	}

}
