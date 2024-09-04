package ExceptionDemo;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
	System.out.println("program is started...");
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a Number:");
	try 
	{
		int num=sc.nextInt();
		System.out.println(100/num); //Arithmetic Expression
	}
	catch(ArithmeticException ap)
	{
		System.out.println("Invalid data for operation");
	}
	
	try 
	{
		int a[]=new int[5];
		System.out.println("Enter postion (0-4):");
		int pos=sc.nextInt();
		int value=sc.nextInt();
		a[pos]=value;
		System.out.println(a[pos]);
	}
	catch(ArrayIndexOutOfBoundsException ae)
	{
		System.out.println("Index is not within range");
	}
	
	//example3
	 String s="welcome";
	 try
	 {
		 int num=Integer.parseInt(s);
		 System.out.println(num); 
	}
	catch(NumberFormatException ne)
	 {
		System.out.println("Invalid Parsing...");
	 }
	 
	 //example4
	 String h=null;
	 try 
	 {
		 System.out.println(h.length()); 
	 }
	 catch(NullPointerException e)
	 {
		 System.out.println("No data.....");
	 }
	 
	 
	 System.out.println("Program is completed...");
	 System.out.println("Program is exited..");
	  
	}

}
