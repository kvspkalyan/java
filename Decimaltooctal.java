import java.io.*;
import java.util.*;
class Decimaltooctal
{
	public static void main(String args[])
	{
		int n;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number:");
		n= s.nextInt();
		String x=String.format("%08d",Integer.valueOf(Integer.toString(n,8)));
		System.out.println("Equivalent Octal number: "+x);
	}
}