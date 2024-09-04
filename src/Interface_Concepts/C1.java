package Interface_Concepts;

public class C1 extends C2 implements I1,I2
{
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Y = " +y);
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("X = " +x);		
	}   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c1obj=new C1();
		c1obj.m1();
		c1obj.m2();
		c1obj.m3();
		
	}

	

}
