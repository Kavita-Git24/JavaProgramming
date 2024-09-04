package Wrapper;

public class DataConversionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String-->Integer
		//String s="welcome"; //This cannot be converted into integer value becuse it does not contain number
		String s1="10";
		String s2="20";
		System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));
		
		//String-->Double
		String s3="10.5";
		String s4="11.5";
		System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));
		
		//String-->Boolean
		String s5="true";
		String s6="Selenium";
		System.out.println(Boolean.parseBoolean(s5));
		System.out.println(Boolean.parseBoolean(s6));
		
		//Scenario2--> integer,double,char,boolean
		int x1=50;
		double x2=50.50;
		boolean x3=true;
		char x4='A';
		
		String s= String.valueOf(x2);
		System.out.println(s);
		
		s= String.valueOf(x1);
		System.out.println(s);
		
		s= String.valueOf(x3);
		System.out.println(s);
		
		s= String.valueOf(x4);
		System.out.println(s);
		
		
	}

}
