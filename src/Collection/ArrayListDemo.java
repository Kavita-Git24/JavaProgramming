package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaration
		ArrayList mylist=new ArrayList();
		//List mylist=new ArrayList();
		mylist.add(100);
		mylist.add(40.5);
		mylist.add(100);
		mylist.add("Welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(null);
		mylist.add(null);
		
		//Size of Arraylist
		System.out.println("Size of ArrayList "+ mylist.size());
		
		//priting Arraylist
		System.out.println("Printing data from Arraylist" +mylist);
		
		//Remove Element from Arraylist
		mylist.remove(0);
		System.out.println("After removing " +mylist);
		
		//inserting element in the arraylist
		mylist.add(2,100);
		System.out.println("Printing data from Arraylist" +mylist);
		
		//Modify Element in the arraylist
		mylist.set(2, 109);
		System.out.println("Printing data from Arraylist" +mylist);
		
		//Access Specific element from ArrayList
		System.out.println("Printing data from element at index 2 in Arraylist " +mylist.get(2));
		
		//Reading all elements from ArrayList
		//Using normal for loop
		/*for (int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}*/
		
		//Using For...Each loop
		/*for(Object m:mylist)
		{
			System.out.println(m);
		}*/
		
		//Using Iterator
		Iterator it=mylist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()); 
		}
		
		//Checking ArrayList is empty or not
		System.out.println("Check list is empty?" +mylist.isEmpty());
		
		//remove multiple elements from linklist
		ArrayList a2=new ArrayList();
		a2.add(null);
		a2.add(100);
		mylist.removeAll(a2);
		System.out.println("After removing multiple elements: " +mylist);
		
		//remove all elements from list
		mylist.clear();
		System.out.println("After removing all elements: " +mylist);
		System.out.println("Check list is empty?" +mylist.isEmpty());
	}

}
