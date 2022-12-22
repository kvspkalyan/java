import java.io.*;
import java.util.*;
class box
{
	double width,height,depth;
	double volume(double w,double h,double d)
	{
		this.width=w;
		this.height=h;
		this.depth=d;
		width++;
		height++;
		depth++;
		return this.depth*this.height*this.depth;
	}
}
class This_second
{
	public static void main(String args[])
	{
		double v,w,h,d;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the values of width,height & depth: ");
		w=s.nextInt();
		h=s.nextInt();
		d=s.nextInt();
		box b=new box();
		v=b.volume(w,h,d);
		System.out.println("volume of box is: "+v);

	}
}