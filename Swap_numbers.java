package JavaPrograms;

import java.util.Scanner;

public class Swap_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number:");
		num1=sc.nextInt();
		System.out.println("Enter Second number:");
		num2=sc.nextInt();
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("Value of num1:" +num1);
		System.out.println("Value of num2:" +num2);
		
	}

}
