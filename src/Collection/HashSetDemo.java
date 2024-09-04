package Collection;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration
		HashSet myset=new HashSet();
		//Set myset=new HashSet();		
		myset.add(100);
		myset.add(100);
		myset.add(10.5);
		myset.add("Welcome");
		myset.add('A');
		myset.add(true);
		myset.add(null);
		myset.add(null);
		
		//Printing the Set
		System.out.println(myset);
		
		myset.remove(null);
		System.out.println(myset);
		
		ArrayList al=new ArrayList(myset);
		System.out.println(al);
		
		System.out.println(al.get(1)); //specific element is accessed
		
		/*for(Object x: myset)
		{
			System.out.println(x);
		}	*/
			
		//Using Iterator
		
		Iterator <Object> it=myset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()); 
		}
		
		//clearing all the elements in hashset
		myset.clear();
		System.out.println(myset.isEmpty());
	}
	

}
