package oops.exceptionHandling;

public class MainClass {

	public static void main(String[] args) 
	{
			fun1();
		// try
//		{
//			int a=5;
//			int b=0;
//			int c=a/b;
//			System.out.println(c);
//			
//			int a[]=new int[5];
//			System.out.println(a[6]);
//		}catch(ArithmeticException obj)
//		{
//			System.out.println(obj.getMessage()+" occured, Please check the code");
//		}
//		catch(ArrayIndexOutOfBoundsException obj){
//			System.out.println("index should be in a range of 0 to size of an array");
//		}
//		catch(IllegalArgumentException obj) {
//			System.out.println("Check your casting");
//		}
//		finally {
//			System.out.println("Sorry for the inconvenience caused");
//		}
//		
//		System.out.println("Very importand code");
//		System.out.println("Need to be run everytime");
	}
	
//			static void fun1() 
//			{
//				int a=5;
//				int b=3;
//				int c=a/b;
//				System.out.println(c);
//				
//				boolean isDanger=true;
//				if(isDanger)
//				{
//				throw new ArrayIndexOutOfBoundsException("Danger was coming");
//				}
//			}	

	static void fun1() 
	{
		int a=5;
		int b=3;
		int c=a/b;
		System.out.println(c);
		try {
		fun2();
		}catch(ArrayIndexOutOfBoundsException obj) {
			System.out.println(obj.getMessage()+" occured");
		}
	}
		
	static void fun2()throws ArrayIndexOutOfBoundsException{
		boolean isDanger=true;
		if(isDanger)
		{
		throw new ArrayIndexOutOfBoundsException("Danger was coming");
		}
	}	

}

