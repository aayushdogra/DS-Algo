package oops;

class Dog
{
	String name, breed,colour;
	int legs,eyes;
	
	public void walk(){
		System.out.println("My dog "+name+" is walking.");
	}
	public void playing() {
		System.out.println("My dog "+name+" is playing");
	}
	public void description() 
	{
		System.out.println("My dog "+name+" is "+breed+" which is "+colour+" in colour and"+" has "+legs+" legs and "+eyes+" eyes.");
	}
}

public class MainClass {

	public static void main(String[] args) 
	{
		Dog dog1=new Dog();
		Dog dog2=new Dog();
		
		dog1.name="Jordan";
		dog1.colour="White";
		dog1.breed="Siberian Husky";
		dog1.eyes=2;
		dog1.legs=4;
		
		dog2.name="Tiger";
		dog2.colour="Brown";
		dog2.breed="American Pitbull";
		dog2.eyes=2;
		dog2.legs=4;
		
		dog1.walk();
		dog2.playing();
		dog1.description();
		dog2.description();
		
	}

}
