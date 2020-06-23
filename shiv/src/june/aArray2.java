package june;

import java.util.*;

public class aArray2 {

	
		public static void main(String args[])
		{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		 
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		     
		}
		int k=s.nextInt();
		rotate(arr,k);
		print(arr);
       
		
		
	}
	   public static void rev(int[] a,int lo,int hi,int k)
	   { 
		   for(int j=0;j<=k;j++)
		   {
			 int t=a[lo];
			 a[lo]=a[hi];
			 a[hi]=t;
			 lo++;
			 hi--;
		   }
		   
		   
	   }
	   public static void rotate(int[] arr,int k)
	   {
		   int lo=0,hi=arr.length;
			rev(arr,0,k-1,k);
			rev(arr,k+1,hi,k);
			rev(arr,lo,hi,k);
			
	   }
	   public static void print(int[] ar)
	   {
		   for(int k=0;k<ar.length;k++)
		   {
			   System.out.print(ar[k]);
		   }
	}
}
