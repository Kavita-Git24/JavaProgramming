package String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Approach1 length charAt
		/* String ori_String="Welcome";
		String rev_String="";
		for(int i=ori_String.length()-1;i>0;i--)
		{
			
			rev_String=rev_String+ ori_String.charAt(i);
		}
		System.out.println("Reverse String:"+rev_String);
		*/
		
		//Approach2 without using String methods by converting string to char array
		/* String ori_String="Welcome";
		String rev_String="";
		char a[]=ori_String.toCharArray();
		for(int i=a.length-1;i>0;i--)
		{
			
			rev_String=rev_String+a[i];
		}
		System.out.println("Reverse String:"+rev_String); 
		*/
		
		//Approach3 using StringBuffer Class
		/*
		StringBuffer s = new StringBuffer("welcome");
		System.out.println("Reverse String:" +s.reverse());
		*/
		
		//Approach4 using StringBuilder Class
		StringBuilder s = new StringBuilder("welcome");
		System.out.println("Reverse String:" +s.reverse());
				
		
	}

}
