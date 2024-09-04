package Finalkeyword;

class p1
{
	void y1()
	{
		System.out.println("eat...");
	}
}
class p2 extends p1
{
	void y1()
	{
		System.out.println("eat bread");
		super.y1();
	}
}

public class Super_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p2 objP =new p2();
		objP.y1();
	}

}
