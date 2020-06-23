package june;

import java.util.Scanner;

public class Arrayrotate {
	
	
	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]arr=new int[n];
		 
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		     
		}
		int k=s.nextInt();
	  arrayrotate(arr,k);

}
	 public static void arrayrotate(int[] arr,int k)
	 {int temp=0;
		 for(int i=0;i<k-1;i++)
		 {
			temp=arr[i];
			arr[i]=arr[k-1];
			arr[k-1]=temp;
		 }
		 for(int i=0;i<arr.length;i++)
		 System.out.print(arr[i]+" ");
		 System.out.println();
		 int p=0;
		 for(int j=k;j<=((arr.length-k)/2)+1;j++)
		 {    
			 int x=arr[arr.length-1-p];
			 arr[arr.length-1-p]=arr[j];
			 arr[j]=x;
			 p++;
		 }
		 for(int i=0;i<arr.length;i++)
			 System.out.print(arr[i]+" ");
			 System.out.println();
		 
		 for(int l=arr.length-1;l>=0;l--)
		 {
			 System.out.print(arr[l]+" ");
		 }
	 }
}
