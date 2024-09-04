package Finalkeyword;

class Animal
{
	String color="White";
}
class Dog extends Animal
{
	String color="Black";
	
	void display()
	{
		System.out.println("Color is " +super.color);
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog objD = new Dog();
		objD.display();
		
	}

}
