package Finalkeyword;

class Test1
{
	final void m1()
	{
		System.out.println("This is a method of test1");
	}
}
class Test2 extends Test1
{
	/*void m1()//this is incorrect becox m1() is final method in parent class
	{
		System.out.println("This is a method of test2");
	}*/
}
public class Finalkeyword_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 testobj=new Test2();
		testobj.m1();
	}

}
