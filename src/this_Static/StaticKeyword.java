package this_Static;

public class StaticKeyword {
	
	static int x,y;
	
	static void display()
	{
		System.out.println("x= " +x);
	}
	
	void m1()
	{
		//non-static can access everyhting directly
		System.out.println("y= " +y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static stuff can be used directly without object
		x=10;
		display();
		
		y=20;
		//static method can access non-static stuff through object
		StaticKeyword m=new StaticKeyword();
		m.m1();
		
	}

}
