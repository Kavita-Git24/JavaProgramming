package Inheritence;

class A2
{
	int x1;
	void display()
	{
		System.out.println("x1 " +x1);
	}
}

class B2 extends A2
{
	int y1;
	void show()
	{
		System.out.println("y1 "+y1);
	}
}
class C2 extends B2
{
	int z1;
	void prnt()
	{
		System.out.println("z1 "+z1);
	}
}

public class Multilevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C2 cobj = new C2();
		cobj.x1=100;
		cobj.y1=200;
		cobj.z1=300;
		cobj.display();
		cobj.show();
		cobj.prnt();
	}

}
