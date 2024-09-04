package String;

import java.util.Arrays;

public class Stringfunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("String Functions");
		//length
		String s= new String("welcome to java programming");
		System.out.println("String length is:"+s.length());
		
		//concat
		String s1="welcome";
		String s2="Java";
		String s3="Program";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2).concat(s3));
		
		//trim
		String s4= "  Java  ";
		System.out.println("Before trim: " +s4.length());
		System.out.println("After trim: " +s4.trim().length());
		
		//charAt at index
		
		System.out.println("Character at index 3: " +s3.charAt(3));
		
		//contains() -returns true or false
		System.out.println("wel " +s1.contains("wel"));
		System.out.println("WEL " +s1.contains("WEL"));
		System.out.println("Wel " +s1.contains("Wel"));
		
		//equal , equalignorecase
		String s5= "welcome";
		String s6= "Welcome";
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		System.out.println(s5.equals("welcome"));
		System.out.println(s5.equalsIgnoreCase(s6));
		
		//replace
		
		String s7="Welcome to selenium java selenium python selenium c#";
		System.out.println(s7.replace('e' , 'x'));
		System.out.println(s7.replace("selenium", "playwright"));
		
		//substring
		System.out.println(s7.substring(0,3));
		
		//uppercase lowercase
		System.out.println(s5.toUpperCase());
		System.out.println(s6.toLowerCase());
		
		//split
		String s8="kavitasingh@gmail.com";
		String s9[]=s8.split("@");
		System.out.println(s9[0]);
		System.out.println(s9[1]);
		System.out.println(Arrays.toString(s9));
		
		String a="$12,15,17";
		System.out.println(a.replace("$", "").replace(",",""));
		
		//split
		String a1[]=a.replace("$","").split(",");
		System.out.println(Arrays.toString(a1));

		System.out.println(a1[0]);
		System.out.println(a1[1]);
		System.out.println(a1[2]);
		
		
		
		
		

	}

}
