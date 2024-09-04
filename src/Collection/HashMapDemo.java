package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration
		HashMap hm=new HashMap();
		//Map hm=new HashMap();
		hm.put(101,"Scott");
		hm.put(102, "Rahul");
		hm.put(103, "Tiger");
		hm.put(104, "David");
		System.out.println(hm);
		System.out.println("Size of hashmap is: "+hm.size());
		hm.remove(101);
		System.out.println("After Removing element: " +hm);
		
		//access particular element
		System.out.println("Accessing particular element: " +hm.get(103));
		
		//access only key
		System.out.println("Access all keys: " +hm.keySet());
		
		//access only values
		System.out.println("Access all values: " +hm.values());
		
		//Reading data
		
		//Using for...each loop
		
		/*for(int k: hm.keySet())
		{
			System.out.println(k+ " " + hm.get(k));
			
		}*/
		
		//Using Iterator
		Iterator <Entry <Integer,String>> it =hm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry <Integer,String> entry=it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		hm.clear();
		System.out.println(hm.isEmpty());
	}

}
