package staticKeyword;

public class StaticBlocks 
{
	static 
	{
		System.out.println("in block 1");
	}
	
	static 
	{
		System.out.println("in block 2");
	}
	public static void main(String[] args) 
	{
		System.out.println("in main block");
	}
	static 
	{
		System.out.println("in block 3");
	}	
}
