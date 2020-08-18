package userInput;
import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int max=0;
		
		max=(a>b)?a:b;
		System.out.println("Maximum of Both numbers is: "+ max);
			
	}

}
