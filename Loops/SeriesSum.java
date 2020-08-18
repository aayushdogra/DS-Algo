package Loops;
import java.util.Scanner;
public class SeriesSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the value of n");
         int n=sc.nextInt();
         float sum=0;
         for(float i=1; i<=n; i++)
         {
        	sum+=1/i; 
         }
         System.out.println("THE SUM IS " + sum);
	}

}
