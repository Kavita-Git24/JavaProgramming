package Polymorphism;

public class Overloadingmainmethod {
	void main(int a)
	{
		System.out.println(a);
	}
	
	void main(String a)
	{
		System.out.println(a);
	}
	
	void main(double a,double b)
	{
		System.out.println(a+b);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloadingmainmethod b1=new Overloadingmainmethod();
		b1.main(15);
		b1.main("John");
		b1.main(10.0,20.0);
	}

}
