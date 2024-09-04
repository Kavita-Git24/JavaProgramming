package JavaPrograms;

public class fibonnacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		num1=0;
		num2=1;
		System.out.print(num1 +" " + num2);		
		
		for(int i=1;i<10;i++)
		{
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.print(" "+num3 );
		}		
	}
}
