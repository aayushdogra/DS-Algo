package oops.polymorphism;

public class MainClass {

	public static void main(String[] args) 
	{
// RUN-TIME POLYMORPHISM
//				Cat c=new Cat();
//		Pet p=c;
//		Animal a=c;
//		
//		c.walk();
//		p.walk();

		greetings("hello, folks");
	}
//	COMPILE-TIME POLYMORPHISM
	public static void greetings() 
	{
		System.out.println("Hi, there");
	}
	public static void greetings(String s) 	
	{
		System.out.println(s);
	}
	public static void greetings(String s, int count) 		
	{
		for(int i=0;i<count;i++) 			
		{
			System.out.println(s);
		}
    }
}
