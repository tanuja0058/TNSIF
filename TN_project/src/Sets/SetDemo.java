package Sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer>set = new HashSet<Integer>();
		set.add(34);
		set.add(47);
		set.add(304);
		set.add(34);
		set.add(74);
		set.add(98);
		System.out.println(set);
		boolean b=set.contains(20);
		System.out.println(b);
		
		boolean b2=set.isEmpty();
		System.out.println(b2);
		
		set.remove(47);
		System.out.println(set);
		
		Iterator<Integer>i=set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next()+"");
		}
		

	}

}
