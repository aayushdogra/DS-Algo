package arrays;
import java.util.Scanner;

public class AverageMarks 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students:");
		int n=sc.nextInt();
		int marks[]=new int[n];
		int average=0;
		System.out.println("Enter marks now!!");
			for(int i=0; i<n; i++) 
			{
			  marks[i]=sc.nextInt();
			}
		for(int i=0; i<n; i++) 
		{
			average+=marks[i];
		}
            average/=n;
            System.out.println("The average marks are "+average+'.');
	}

}
