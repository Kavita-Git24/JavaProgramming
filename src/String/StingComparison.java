package String;

public class StingComparison {

	public static void main(String[] args) {
		// Case1
		String s1="welcome";
		String s2="welcome";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		// Case2
		String s3= new String("welcome");
		String s4=new String("welcome");
		System.out.println(s3 == s4); // compares object
		System.out.println(s3.equals(s4)); //compares values of object
		
		// Case3
		String s5= "welcome";
		String s6=new String("welcome");
		System.out.println(s5 == s6); // compares object
		System.out.println(s5.equals(s6)); //compares values of object
		
		// Case4
		String s7= "welcome";
		String s8=new String("welcome");
		String s9=s8;
		System.out.println(s7 == s8); // compares object
		System.out.println(s7.equals(s8)); //compares values of object
		
		System.out.println(s8 == s9); // compares object both refers to same object
		System.out.println(s8.equals(s9)); //compares values of object
		
		System.out.println(s7 == s9); // compares object
		System.out.println(s7.equals(s9)); //compares values of object
	}

}
