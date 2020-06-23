package june;

import java.util.*;

public class Arrayfrequency {

	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int[] arr= {1,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,1,2,4,5,6,7};
	int[] freq=new int[10];
	for(int i=0;i<arr.length;i++)
	{
		int ele=arr[i];
		freq[ele]++;
	}
	ArrayList<Integer> arr5=new ArrayList<>();
	for(int j=0;j<freq.length;j++)
	{
		if(freq[j]!=0)
			arr5.add(j);
	}
	
	System.out.println(arr5);
}
}
