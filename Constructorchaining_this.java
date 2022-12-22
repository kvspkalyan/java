import java.io.*;
import java.util.*;
class Test
{
	int a;
	Test()
	{
		this(15);
		System.out.println("In constructor 1");
	}
	Test(int x)
	{
		System.out.println("In constructor 2: "+x);
	}
}
class Constructorchaining_this
{
	public static void main(String args[])
	{
		Test t=new Test();
		System.out.println("In main method");
	}
}