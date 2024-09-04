package Interface_Concepts;

interface Shape
{
	int lenght=10; //final and static
	int width=20; //final and static
	
	default void square()
	{
		System.out.println("This is square - default method");
	}
	
	abstract void circle(); //abstract method
	
	static void rectangle()
	{
		System.out.println("This is rectangle - public method");
		
	}
}

public class InterfaceDemo implements Shape{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scenario1
		InterfaceDemo iObj=new InterfaceDemo();
		/* iObj.square(); //default
		iObj.circle(); //abstract
		Shape.rectangle(); //static*/
		
		//Scenario2
		Shape sh= new InterfaceDemo();
		sh.square(); //default
		sh.circle(); //abstract
		Shape.rectangle(); //static
		iObj.triangle();
		
		System.out.println(Shape.lenght * Shape.width);
	} 

	@Override
	public void circle() {
		// TODO Auto-generated method stub
		System.out.println("This is circle - abstract method ");
	}
	
	public void triangle()
	{
		System.out.println("This is triangle - simple method");
	}

}
