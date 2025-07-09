package JaggedArray;

class JaggedArray
{
	static void printArray(int c[][]) {
		System.out.println("Array of elements are as follows");
		for (int i=0; i<c.length;i++)
		{
			for(int j=0; j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}




public class JaggedArrayDemo {

	public static void main(String[] args) {
		
	int c[][]= { {1,52,3,34} , {90,20} , {9} , {15,92,778,807} };
		
		System.out.println("No. of row in C array :"+c.length);
JaggedArray.printArray(c);


System.out.println("Exit");

	}

}