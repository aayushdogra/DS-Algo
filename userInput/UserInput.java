package userInput;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int principle=sc.nextInt();
		float rate=sc.nextFloat();
		int time=sc.nextInt();
		
		float SimpleInterest= (principle * rate * time)/100;
		System.out.println("The Simple Intrest is: "+SimpleInterest);
			

	}

}
