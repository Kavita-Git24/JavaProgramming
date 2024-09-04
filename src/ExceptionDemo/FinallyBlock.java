package ExceptionDemo;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome";
		
		try 
		{
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Handle Exception...");
			System.out.println(e.getMessage());	
		}
		finally
		{
			System.out.println("you entered into finally block");
		}
		
		System.out.println("Program finished....");
	}

}
