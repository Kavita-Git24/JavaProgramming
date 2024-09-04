package Inheritence;

class Parent
{
	int x2;
	void display()
	{
		System.out.println("x2 " +x2);
	}
}

class Child1 extends Parent
{
	int y2;
	void show()
	{
		System.out.println("y2 "+y2);
	}
}
class Child2 extends Parent
{
	int z2;
	void print()
	{
		System.out.println("z2 "+z2);
	}
}

public class HierachyInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 ch1obj=new Child1();
		ch1obj.x2=100;
		ch1obj.y2=200;
		ch1obj.display();
		ch1obj.show();
		
		Child2 ch2obj=new Child2();
		ch2obj.x2=300;
		ch2obj.z2=400;
		ch2obj.display();
		ch2obj.print();
		
		}

}
