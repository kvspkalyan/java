import java.io.*;
import java.util.*;
class SGPA
{
	public static void main(String args[])
	{
		String subjects[]={"Graphics","PPS","Java","Chemistry","English","Technical skills","Python"};
		double cr[]={2,4,3,3,2,1.5,4};
		int i,n;
		n = subjects.length;
		char Grade[]= new char[20];
		Scanner s =new Scanner(System.in);
		for(i=0;i<n;i++)
		{
			System.out.print("Enter grade of " +subjects[i]+" :");
			Grade[i]=s.next().charAt(0);
		}
		int GP[]=new int[20];
		for(i=0;i<n;i++)
		{
			switch(Grade[i])
			{
				case 'O': GP[i]=10;
					break;
				case 'A': GP[i]=9;
					break;
				case 'B': GP[i]=8;
					break;
				case 'C': GP[i]=7;
					break;
				case 'D': GP[i]=6;
					break;
				case 'E': GP[i]=5;
					break;
				case 'F': GP[i]=0;
					System.out.println("you are failed");
					System.exit(0);
				case 'o': GP[i]=10;
					break;
				case 'a': GP[i]=9;
					break;
				case 'b': GP[i]=8;
					break;
				case 'c': GP[i]=7;
					break;
				case 'd': GP[i]=6;
					break;
				case 'e': GP[i]=5;
					break;
				case 'f': GP[i]=0;
					System.out.println("you are failed");
					System.exit(0);
				default : System.out.println("Enter correct Grade:");
					System.exit(0);
					

			}
		}
		double sum=0,tc=0,sgpa;
		for(i=0;i<n;i++)
		{
			sum=sum+cr[i]*GP[i];
			tc=tc+cr[i];
		}
		sgpa=sum/tc;
		System.out.println("SGPA is : "+sgpa);
	}
}