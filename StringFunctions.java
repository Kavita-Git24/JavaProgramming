package JavaPrograms;

public class StringFunctions {

	static String RemoveJunk(String s)
	{
		String onlyString=s;
		System.out.println("String BEFORE removing Junk :" +onlyString);
		onlyString = s.replaceAll("[^a-zA-Z0-9]","");
		return onlyString;
	}
	static String RemoveWhiteSpace(String s1)
	{
		String onlyString=s1;
		System.out.println("String before removing White Space:" +onlyString);
		onlyString = s1.replaceAll("\\s","");
		return onlyString;
	}
	static void CountOccurences(String s2)
	{
		
		int totalcount=s2.length();
		int totalcount_afterremove=s2.replace("o","").length();
		int count=totalcount-totalcount_afterremove;
		System.out.println("Number of Occurences of o " +count);
		
		/*int totalcount_afterreplace,count;
		for(int i=0;i<totallen;i++)
		{
			totalcount_afterreplace = s2.replace("a", "").length();
		}
		count = totallen-totalcount_afterreplace;*/
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String try1="Good Morning Sushmit@ 15-09-2024";
		try1=try1.replaceAll("[^a-zA-Z0-9]","");
		System.out.println("String AFTER removing Junk:" +RemoveJunk(try1));
		
		String try2="Good Morning Every One with 1000 likes";
		System.out.println("String after removing White Space:" +RemoveWhiteSpace(try2));
		
		CountOccurences(try1);
		
	}

}
