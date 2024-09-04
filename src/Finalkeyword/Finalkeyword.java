package Finalkeyword;

class finaldemo
{
	final int m=200;
	
	void m1()
	{
		System.out.println(m);
	}
}


public class Finalkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		finaldemo m1obj = new finaldemo();
		//m1obj.m=100;//incorrect because it is final so its constant
		m1obj.m1();
	}

}
