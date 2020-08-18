package oops.Inheritance;

public class Person 
{
	protected String name;
	
	public Person(String name)
	{
		this.name=name;
		System.out.println("inside person constructor");
	}
public void eat() 
{
	System.out.println("Person "+name+" is eating");
}
public void walk() 
{
	System.out.println("Person "+name+" is walking");
}
public static void laugh() 
{
	System.out.println("Person is laughing");
}
}
