import java.io.*;
import java.util.*;
class Decimaltobinary
{
	public static void main(String args[])
	{
		int n;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number:");
		n= s.nextInt();
		String x=String.format("%08d",Integer.valueOf(Integer.toString(n,2)));
		System.out.println("Equivalent Binary number: "+x);
	}
}

