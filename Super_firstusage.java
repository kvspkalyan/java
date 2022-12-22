import java.io.*;
import java.util.*;
class box
{
	double width,depth,height;
	box(double l)
	{
		width=l;
		depth=l;
		height=l;
	}
	box(double w,double d,double h)
	{
		width=w;
		depth=d;
		height=h;
	}
	double volume()
	{
		return width*height*depth;
	}
}
class box_weight extends box
{
	double weight;
	box_weight(double w,double d,double h,double we)
	{
		super(w,d,h);
		weight=we;
		System.out.println("weight of box:"+weight);
	}
}
class Super_firstusage
{
	public static void main(String args[])
	{
		double v1,v2,v3;
		box b1=new box(10);
		v1=b1.volume();
		System.out.println("box1 volume:"+v1);
		box b2=new box(10,20,30);
		v2=b2.volume();
		System.out.println("box2 volume:"+v2);
		box_weight b3=new box_weight(20,30,40,100);
		v3=b3.volume();
		System.out.println("box3 volume:"+v3);
	}
}