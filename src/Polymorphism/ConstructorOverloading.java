package Polymorphism;

public class ConstructorOverloading {
	double height,width,depth;
	
	ConstructorOverloading()
	{
		
		height=width=depth=0;
	
	}
	ConstructorOverloading(double a,double b,double c)
	{
		 height=a;
		 width=b;
		 depth=c;
	}
	ConstructorOverloading(double length)
	{
		height=width=depth=length;
		
	}
	void volume()
	{
		System.out.println(height*width*depth);
	}
}
