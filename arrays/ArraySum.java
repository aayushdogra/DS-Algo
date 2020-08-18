package arrays;
import java.util.*;

public class ArraySum 
{
	static int sumOfArrayElements(int ar[], int n)
    {
            int sum=0;
            for(int i=0; i<n; i++)
            {
                sum+=ar[i];
            }
            return sum;
    }
   
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0; i<n; i++)
        {
            ar[i]=sc.nextInt();
        }
        sumOfArrayElements(ar, n);
    }
}
