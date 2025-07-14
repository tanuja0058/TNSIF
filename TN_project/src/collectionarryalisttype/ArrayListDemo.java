package collectionarryalisttype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[]args)
	{
		List  list = new ArrayList();  //Dynamic binding
		System.out.println(list.isEmpty());
		
		list.add(10);
		list.add(20);
		list.add("Tanuja");
		list.add("heti");
		list.add(false);
		list.add(true);
		list.add(20);
		list.add(12.4f);
		list.add(10);
		System.out.println("List is"+list);
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list.contains(89));
		list.remove(false);
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		
		list.lastIndexOf(20);
		System.out.println(list);
		
		System.out.println(list.indexOf(20));
		list.clear();
		System.out.println(list);
		
		System.out.println("_________________________________________________________________________________");
		
		//Generics
		List<String>names=new ArrayList<String>();
		names.add("Tanu");
		names.add(null);
		names.add("SHubham");
		names.add("Tanu");
		
		
		names.add("Tota");
		System.out.println(names);
		
		//Collections.reverse(names);
		//System.out.println(names);
		
		//System.out.println(names.contains("DILIP"));
		//Collections.sort(names);
		
		//traversing in list 
		Iterator<String>i =names.iterator();
		while(i.hasNext()) {
			String nm=i.next();
			System.out.println(nm+"");
			

			}
		System.out.println();
		System.out.println(names );
		
		
		
	
		
	}
}
