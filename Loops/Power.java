package Loops;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int x=sc.nextInt();
		
		System.out.println("Enter the power: ");
		int y=sc.nextInt();
		int result=1;
	for(int i=0; i<y; i++)
	{
		result=result*x;
	}
	System.out.println("THE RESULT IS: " + result);
	}

}
