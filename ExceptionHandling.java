import java.util.*;
import java.lang.*;
class ExceptionHandling
{
	public static void main(String args[])
	{
		try
		{
			int a,b,d;
			a=Integer.parseInt(args[0]);
			b=50/a;
			System.out.println("Division result:"+b);
			int c[]=new int[5];
			c[a]=Integer.parseInt(args[1]);
			System.out.println("Elements at index"+a+"is:"+c[a]);
			d=Integer.parseInt(args[2]);
			System.out.println("value of d is:"+d);
			char ch=args[3].charAt(5);
			System.out.println("character at 5th index is:"+ch);
			if(args[3].length()<10)
			{
				String s=null;
				System.out.println("Length of string is:"+s.length());
			}
			System.out.println("Given string is:"+args[3]);
		}
		catch(ArithmeticException e1)
		{
			System.out.println(e1);
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println(e2);
		}
		catch(NumberFormatException e3)
		{
			System.out.println(e3);
		}
		catch(StringIndexOutOfBoundsException e4)
		{
			System.out.println(e4);
		}
		catch(NullPointerException e5)
		{
			System.out.println(e5);
		}
	}
}