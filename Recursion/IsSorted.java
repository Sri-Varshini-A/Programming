package Recursion;

import java.util.*;

public class IsSorted {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
	        arr[i]=sc.nextInt();
	     }
		int i=1;
	    if(Sorted(arr,n,i))
	    {
	        System.out.print("yes");
	     }
	    else
	    {
	        System.out.print("no");
	    }
	}
	public static boolean Sorted(int[] arr,int n,int i)
	{
	      if(i==n)
	      {
	        return true;
	      }
	      if(arr[i-1]<=arr[i])
	      {
	        return Sorted(arr,n,i+1);
	      }
	      return false;
	  }
}
