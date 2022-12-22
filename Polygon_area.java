import java.util.*;
class Polygon
{
 double area(double x)
 {
   return x*x;
 }
 double area(double x,double y)
 { 
   return x*y;
 }
 double area(double x,double y,double z)
 { 
   double s;
   s=(x+y+z)/2;
   return Math.sqrt(s*(s-x)*(s-y)*(s-z));
 }
}
class Polygon_area
{
 public static void main(String args[])
 { 
   double x,y,z;
   Scanner s=new Scanner(System.in);
   Polygon p=new Polygon();
   System.out.println("enter side of square");
   x=s.nextDouble();
   System.out.println("area of square is"+p.area(x));
   System.out.println("enter side of rectangle");
   x=s.nextDouble();
   y=s.nextDouble();
   System.out.println("area of rectangle is"+p.area(x,y)); 
   System.out.println("enter sides of triangle");
   x=s.nextDouble();
   y=s.nextDouble();
   z=s.nextDouble();
   System.out.println("area of triangle is"+p.area(x,y,z));
}
}

   
   