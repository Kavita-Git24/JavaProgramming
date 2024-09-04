package String;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String - immutable
		String s1=new String("welcome");
		s1.concat(" to java");
		System.out.println(s1);
		
		//StringBuffer- mutable change
		StringBuffer s2=new StringBuffer("welcome");
		s2.append(" to java");
		System.out.println(s2);
		
		//StringBuilder- mutable change
		StringBuilder s3=new StringBuilder("welcome");
		s3.append(" to java");
		System.out.println(s3);
		
	}

}
