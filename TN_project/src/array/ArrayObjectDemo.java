package array;
//2d array
public class ArrayObjectDemo {

	public static void main(String[] args) {
		// Student s=new Student(0,null)
		Student[]arr;
		//declared memory fo r5 object or 5 student
		
		arr=new Student[5];
		arr[0]=new Student(101,"Heti");
		arr[1]=new Student(102,"Shubham");
		arr[2]=new Student(103,"Tanu");
		arr[3]=new Student(104,"Shruti");
		arr[4]=new Student(105,"Sharu");
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Elements at"+i+":"+arr[i].getRollno()+"\t"+arr[i].getName());
		}
	}

}
