package Loops;
import java.util.Scanner;
public class FactorialOf {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to finds its fctorial.");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1; i<=n; i++)
		{
			 fact*=i;
		}
     System.out.println(fact);
	}

}
