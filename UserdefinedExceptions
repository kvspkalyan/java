import java.io.*;
import java.util.*;
class InvalidRollNoException extends Exception
{
	public  InvalidRollNoException(String str)
	{
		super(str);
	}
}
class InvalidBranchNameException extends Exception
{
	public  InvalidBranchNameException(String str)
	{
		super(str);
	}
}
class InvalidBranchCodeException extends Exception
{
	public  InvalidBranchCodeException(String str)
	{
		super(str);
	}
}
class UserdefinedExceptions
{
	public static void main(String args[])
	{
		try
		{
			Scanner s = new Scanner(System.in);
			String rno,bname;
			int bcode;
			System.out.println("Enter your roll no:");
			rno=s.next();
			if(rno.length() != 10)
			{
				throw new InvalidRollNoException("Invalid Roll NO");
			}
			else
			{
				System.out.println("Roll no:"+rno);
			}
			System.out.println("Enter your branch name:");
			bname =s.next();
			if(bname.equals("CSE") != true)
			{
				throw new InvalidBranchNameException("Invalid Branch Name");
			}
			else
			{
				System.out.println("branch name:"+bname);
			}
			System.out.println("Enter your branch code:");
			bcode = s.nextInt();
			if(bcode != 5)
			{
				throw new InvalidBranchCodeException("Invalid Branch Code");
			}
			else
			{
				System.out.println("branch code:"+bcode);
			}
		}
		catch(InvalidRollNoException e)
		{
			System.out.println(e);
		}
		catch(InvalidBranchNameException e)
		{
			System.out.println(e);
		}
		catch(InvalidBranchCodeException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("In finally block");
		}
	}
}		
