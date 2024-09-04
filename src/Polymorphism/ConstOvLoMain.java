package Polymorphism;

public class ConstOvLoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorOverloading c1=new ConstructorOverloading();
		c1.volume();
		ConstructorOverloading c3=new ConstructorOverloading(9.0,5.0,10.0);
		c3.volume();
		ConstructorOverloading c4=new ConstructorOverloading(6.0);
		c4.volume();
		}

}
