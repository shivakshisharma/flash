package june;

import java.util.*;

public class Arrreverse {
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] arr=new int[n];
	 
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	     
	}

	search(arr);
	
	
}
   public static void search(int[] a)
   { 
	   for(int j=a.length-1;j>=0;j--)
	   {
		 System.out.print(a[j]+" ");  
	   }
	   
   }
}



