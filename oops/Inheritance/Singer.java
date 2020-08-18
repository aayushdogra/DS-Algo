package oops.Inheritance;

public class Singer extends Person
{
	public Singer(String name) {
		super(name);
	}
   public void Sing() 
   {
	System.out.println(name+" is singing");
   }
   public void eat() 
   {
   	System.out.println("Singer "+name+" is eating");
   }
   public static void laugh() 
   {
   	System.out.println("Singer is laughing");
   }
}
