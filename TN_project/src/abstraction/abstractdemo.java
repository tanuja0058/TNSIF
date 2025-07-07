package abstraction;
//to achieve 100% abstraction we use interface 
public class abstractdemo {

	public static void main(String[] args) {
		Shape s;
		s=new Square();
		s.calArea();
		s.show();
		//both are default
		s= new Rectangular();
		s.calArea();
		s.show();
		
		s = new Rectangular(23.4f,64.94f);
		s.calArea();
		s.show();
		
		

	}

}
