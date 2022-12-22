import java.io.*;
import java.util.*;
class Test
{
	int a,b,t;
	void Swap(Test te)
	{
		System.out.println("Before swapping a= "+te.a+" and b= "+te.b);
		t=te.a;
		te.a=te.b;
		te.b=t;
		System.out.println("After swapping a= "+te.a+" and b= "+te.b);
	}
} 
class Swap_obj
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter a and b values: ");
		Test te=new Test();
		te.a=s.nextInt();
		te.b=s.nextInt();
		System.out.println("before calling a= "+te.a+ " and b= "+te.b);
		te.Swap(te);
		System.out.println("After calling a= "+te.a+" and b= "+te.b);
	}
}
