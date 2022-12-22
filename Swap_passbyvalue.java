import java.io.*;
import java.util.*;
class Swap_passbyvalue
{
	public static void main(String args[])
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a and b values: ");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("before calling a= "+a+ " and b= "+b);
		Test t=new Test();
		t.swap(a,b);
		System.out.println("After calling a= "+a+" and b= "+b);
	}
}
class Test
{
	void swap(int x,int y)
	{
		System.out.println("Before swapping a= "+x+" and b= "+y);
		int t;
		t=x;
		x=y;
		y=t;
		System.out.println("After swapping a= "+x+" and b= "+y);
	}
} 