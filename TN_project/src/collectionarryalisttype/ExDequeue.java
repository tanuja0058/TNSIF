package collectionarryalisttype;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque1 = new ArrayDeque<String>();
		deque1.add("Shubham");
		deque1.add("Tanuja");
		deque1.add("Shruti");
		deque1.add("Shakira");
		deque1.add("totaaa");
		
		System.out.println(deque1);
		deque1.pollLast();
		System.out.println(deque1);
		
		//iterationg data 
		for(String str:deque1) {
			System.out.println("deque is:"+str);
		}
		System.out.println(deque1);
		

	}

}



