 package ExceptionDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Program started...");
		System.out.println("Program in progress...");
		
	
			FileInputStream file =
			new FileInputStream("C:\\Users\\Kavita singh\\OneDrive\\Kavita\\Postmanchallenge\\Kavita Singh.Txt");
		
		try 
		{
			Thread.sleep(5000);	
		}
		
		catch(InterruptedException e) 
		{}

		System.out.println("Program finished...");
		System.out.println("Program exited...");

	}

}
