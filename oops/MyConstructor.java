package oops;

//Constructor
//class Vehicle{
//	Vehicle(){
//		System.out.println("Object is created");
//	}
//}


//No Argument constructor
//class Vehicle{
//	int wheels;
//	Vehicle(){
//		wheels=4;
//	}
//}


//Parameterised Constructor
//class Vehicle{
//	int wheels;
//	Vehicle(int noOfWheels)
//	{
//		wheels=noOfWheels;
//	}
//}



//Constructor Overloading 
class Vehicle{
	int wheels, headlights;
	String color;
	
	Vehicle(int wheels) //Constructor Overloading
	{
		this.wheels=wheels; //Using "this" keyword
	}
	
	Vehicle(int wheels, String color) //Constructor Overloading
	{
		this.wheels=wheels; //Using "this" keyword
		this.color=color;   //Using "this" keyword
	}
	
}
public class MyConstructor 
{
	public static void main(String[] args) 
	{
		
		Vehicle car=new Vehicle(4);
		Vehicle bike=new Vehicle(2);
		Vehicle eRikshaw=new Vehicle(3,"Yellow");
		
		System.out.println(eRikshaw.wheels+" wheels and color is "+eRikshaw.color);
		
	}

}
