package whileLoop;
import java.util.Scanner;
public class Palindrome 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		
		while(temp>0) 
		{
		    int LastDigit=temp%10;
		    rev=rev*10+LastDigit;
		    temp/=10;
		}
		if(n==rev)
		{
			System.out.println("Number is Palindrome number.");
		}
		else 
		{
			System.out.println("Number is not a Palindrome number.");
		}

	}

}
