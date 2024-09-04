package Overriding_super_final;

class Bank{
	double roi()
	{
		return 0;
	}
}

class SBI extends Bank{
	double roi()
	{
		return 10.5;
	}
}
class ICICI extends Bank{
	double roi()
	{
		return 11.5;
	}
}
public class OverridingDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s=new SBI();
		System.out.println(s.roi());  
		ICICI i=new ICICI();
		System.out.println(i.roi()); 
	}

}
