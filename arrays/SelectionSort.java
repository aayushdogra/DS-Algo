package arrays;
import java.util.Scanner;
public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
        int n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter the elements to be sorted");
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
			
			for(int i=0; i<n-1; i++)
			{
				int MinIndex=i;
				for(int j=i; j<n; j++) 
				{
					if(a[j]<a[MinIndex]) 
					{
						MinIndex=j;
					}
				}
				int temp=a[i];
				a[i]=a[MinIndex];
				a[MinIndex]=temp;
				
		}
			System.out.println("The sorted array is");
			for(int e: a) {
				System.out.print(e + " ");
			}

	}

}
