import java.io.*;
import java.util.*;

class Addarray
{
	public static void main(String args[])
	{
		int n,i,temp;
		temp=0;
		int a[]=new int[20];
		System.out.println("Enter the size of the array:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.print("sum of array elements: ");
		for(i=0;i<n;i++)
		{
			temp=temp+a[i];
			System.out.print(temp);
		}
	}
}