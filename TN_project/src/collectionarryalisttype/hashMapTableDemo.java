package collectionarryalisttype;

import java.util.Hashtable;
import java.util.Set;

public class hashMapTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String>ht=new Hashtable<Integer,String>();
		ht.put(101, "Mumbai");
		ht.put(102, "Pune");
		ht.put(103, "Mumbai");
		ht.put(104, "latur");
		ht.put(101, " New Mumbai");
		System.out.println(ht);
		
		//we cannot include null values
		//ht.put(34, null);
		
		System.out.println(ht.get(102));
		System.out.println(ht.replace(102, "PCMC"));
		System.out.println(ht);
		
		ht.clone();
		System.out.println(ht);
		
		Set s =ht.keySet();
		System.out.println(s);
		
		

	}

}
