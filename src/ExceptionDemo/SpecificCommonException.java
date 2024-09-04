package ExceptionDemo;

public class SpecificCommonException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
		
		try 
		{
			System.out.println(s.length());
		}
		
		/*catch(NullPointerException e)
		{
			System.out.println("Handle Exception...");
			System.out.println(e.getMessage());			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Handle Exception...");
			System.out.println(e.getMessage());			
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("Handle Exception...");
			System.out.println(e.getMessage());			
		}*/
		
		catch(Exception e)
		{
			System.out.println("Handle Exception...");
			System.out.println(e.getMessage());	
		}
		
		
	}

}
