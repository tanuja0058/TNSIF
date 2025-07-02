package day3;

public class NestedForLoop_MultiplicationTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int beg=5;
		int end = 20;
		for(int i=beg; i<=end;i++) {
			for(int j =1; j<=10; j++) {
				System.out.println(i + "*"+ j+ "="+i*j);
			}
			System.out.println();
		}

	}

}
