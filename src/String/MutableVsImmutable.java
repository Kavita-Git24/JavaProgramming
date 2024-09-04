package String;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mutable - can change
		int a[]= {90,20,40,70};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		//immutable -cannot change
		String s=new String("Welcome");
		System.out.println(s);
		String concatString=s.concat(" to Java");
		System.out.println(concatString);
		System.out.println(s);
	}

}
