package userInput;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a=sc.nextInt();
		System.out.println("Enter Second Number: ");
		int b=sc.nextInt();
		
		int result=0;
		int max=0;
		int ch;
		
		System.out.println("PRESS 1 FOR ADDITION.");
		System.out.println("PRESS 2 FOR SUBTRACTION.");
		System.out.println("PRESS 3 FOR MULTIPLACTION.");
		System.out.println("PRESS 4 FOR DIVISON.");
		
		System.out.println("ENTER YOUR CHOICE: ");
		 ch=sc.nextInt();
		
	switch(ch)
	{
	case 1:result=a+b;
	       System.out.println("THE ADDITION IS " + result +'.');
	       break;
	
	case 2:max=(a>b)?a:b;
	       if(max==a)
	    	   result=a-b;
	       else
	    	   result=b-a;
	       System.out.println("THE SUBTRACTION IS " + result +'.');
	       break;
	
	case 3:result=a*b;
	       System.out.println("THE MULTIPLICATION IS " + result +'.');
	       break;
	
	case 4:max=(a>b)?a:b;
	       if(max==a)
	    	   result=a/b;
	       else
	    	   result=b/a;
	       System.out.println("THE DIVISON IS " + result +'.');
	       break;
	
	default:System.out.println("INVALID CHOICE !! TRY AGAIN.");
	}

	}
}
