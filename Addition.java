import java.io.*;
import java.util.*;

class Addition
{
     public static void main(String args[])
     {
           int a,b,c;
           Scanner s=new Scanner(System.in);
           System.out.println("enter two values:");
           a=s.nextInt();
           b=s.nextInt();
           c=a+b;
           System.out.println("addition of "+a+" and "+b +"is "+c);
     }
}
