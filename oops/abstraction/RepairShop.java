package oops.abstraction;

public class RepairShop {
	public static void  repairCar(Car car) 
	{
		System.out.println("car is repaired");
	}

	public static void main(String[] args) {
		Creta c=new Creta();
		Verna v=new Verna();
		repairCar(c);
		repairCar(v);
	}

}
