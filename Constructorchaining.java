import java.io.*;
class Test
{
Test()
 {
new Test(20);
   System.out.println("In constructor 1");
 }
Test(int a)
 {
  System.out.println("In constructor 2:"+a);
 }
}
class Constructorchaining
{ 
 public static void main(String args[])
 {
   Test t=new Test();
   System.out.println("In  main method");
 }
}

