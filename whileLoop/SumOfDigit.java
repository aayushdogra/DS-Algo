package whileLoop;
import java.util.Scanner;
public class SumOfDigit 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		
		while(temp>0)
		{
			int LastDigit=temp%10;
			sum+=LastDigit;
			temp=temp/10;
		}
		System.out.println("The sum of the digits of " + n + " is " + sum + '.');

	}

}
