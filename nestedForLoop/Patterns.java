package nestedForLoop;
import java.util.Scanner;
public class Patterns {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE VALUE OF N: ");
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++) 
		{
			for(int j=1; j<=n; j++) 
			{
				System.out.print('*' + " ");
			}
			System.out.println();
		}
		
		

	}

}
