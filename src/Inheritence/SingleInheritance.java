package Inheritence;
class A
{
	int a1=100;
	void display()
	{
		System.out.println("a1 " +a1);
	}
}

class B extends A
{
	int b1=200;
	void show()
	{
		System.out.println("b1 "+b1);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B bobj = new B();
		bobj.display();
		bobj.show();
	}
	

}

