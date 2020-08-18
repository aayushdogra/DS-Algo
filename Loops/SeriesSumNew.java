package Loops;
import java.util.Scanner;

public class SeriesSumNew {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		float sum=0;
		
		for(float i=1; i<=n; i++) 
		{
			if(i%2==0)
			{
				sum-=1/i;
			}
			else
			{
				sum+=1/i;
			}
		
		}   
			
System.out.println("Sum of the series is: " + sum);
	}

}
