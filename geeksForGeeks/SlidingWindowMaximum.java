package geeksForGeeks;
import java.util.*;

public class SlidingWindowMaximum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		Solution solution=new Solution();
		
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter the numbers: ");
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        
        System.out.println("Enter the window size: ");
        int k=sc.nextInt();
		int ans[]=solution.maxSlidingWindow(a, k);
	
		for(int x: ans) {
			System.out.print(x+" ");
		}
	}
	
	
static class Solution{

	public int[] maxSlidingWindow(int[] a, int k) {
		
		int n=a.length;
		
		if(n<=1) {
		return a;	
		}
		
		Deque<Integer> dq=new LinkedList<>();
		int ans[]=new int[n-k+1];
		int i=0;
		for(; i<k; i++) {
			while(!dq.isEmpty() && a[dq.peekLast()] <= a[i] ) {
				dq.removeLast();
			}
			dq.addLast(i);
		}
		 
		for(; i<n; i++) {
			ans[i-k]=a[dq.peekFirst()];
			
			while(!dq.isEmpty() && dq.peekFirst() <= i-k) {
				dq.removeFirst();
			}
			
			while(!dq.isEmpty() && a[dq.peekLast()] <= a[i] ) {
				dq.removeLast();
			}
			dq.addLast(i);
		}
		
		ans[i-k]=a[dq.peekFirst()];
		return ans;
	 }
  }

}

