package JavaPrograms;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		int num,count=0,i;
		System.out.println("Enter Number:");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;			
		}
		if(count==2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime Number");
		}
	}

}
