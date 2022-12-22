import java.io.*;
import java.util.*;
import java.lang.*;
class Luckynumber
{
	public static void main(String args[])
	{
		int n,i,j,c=0,sum;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the no.of elements in the array:");
		n= s.nextInt();
		int a[]= new int[20];
		int b[]= new int[20];
		System.out.println("enter the elements to the array:");
		for(i=0;i<n;i++)
		{
			a[i]= s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			sum=0;
			for(j=1;j<10;j++)
			{
				sum= sum + (int)Math.pow(7,j);
				if(a[i]==sum)
				{
					b[c]=a[i];
					c++;
					break;
				}
			}
		}
		System.out.println("number of lucky numbers are: "+c);
		System.out.println("Lucky numbers are:");
		for(i=0;i<c;i++)
		{
			System.out.println(b[i] + " ");
		}
	}
}
	