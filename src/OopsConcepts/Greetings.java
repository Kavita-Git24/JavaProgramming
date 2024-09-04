package OopsConcepts;

public class Greetings {
	//no param no return
	void display1()
	{
		System.out.println("Hello...");
	}
	
	//no param return value
	String display2()
	{
		return("Hello World!");		
	}
	//param noreturn
	void display3(String a)
	{
		System.out.println(a);
	}
	
	//params return
	String display4(String a)
	{
		String a1=a;
		return a1;
	}
}
