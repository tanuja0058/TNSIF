package array;

import java.util.Arrays;

public class Arrayclassdemo {

	public static void main(String[] args) {
	
		//get the array
		
		int intArr[]= {23,34,56,78,87};
		//print array
		System.out.println(Arrays.toString(intArr));
		
		for(int i = 0; i<intArr.length; i++) {
		
			System.out.println(intArr[i]+ " ");
		}
		System.out.println();
		//sort
			Arrays.sort(intArr);
			System.out.println(Arrays.toString(intArr));
			
			//binary search
			System.out.println(Arrays.binarySearch(intArr,3));
			
			//comparison
			System.out.println(Arrays.toString(intArr));
			
			//get second array
			int intArr1[]= {4,5,7,9,8,7};
			System.out.println(intArr1);
			
			Arrays.sort(intArr1);
			
			//comparing both array
			if(Arrays.compare(intArr,intArr1)==0) {
				System.out.println("BOth array same");
			}
			else {
				System.out.println("both array not same");
			}
			//copy array 
			int intArr2[]=Arrays.copyOf(intArr1, 2);
			System.out.println(Arrays.toString(intArr2));
			
			int intArr3[]=Arrays.copyOfRange(intArr1, 2, 4);
			System.out.println(Arrays.toString(intArr3));
			
			//fill method 
			Arrays.fill(intArr3,7);
			System.out.println(Arrays.toString(intArr3));
		

	}

}
