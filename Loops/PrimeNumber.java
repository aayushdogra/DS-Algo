package Loops;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENTER A VALID POSITIVE INTEGER");
		int n=sc.nextInt();
		
		boolean isPrime= true;
		if(n==1)
		{
			isPrime= false;
		}
		
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
			{
				isPrime= false;
				break;
			}
			else
			{
				isPrime= true;
				break;
			}
			
		}
		System.out.println("is Prime ? " + isPrime);
	}

}
