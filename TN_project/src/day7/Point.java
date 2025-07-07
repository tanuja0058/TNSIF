package day7;
//Constructor Overloading a class have n no of constructor with same name different paramter 

public class Point {
	private float x;
	private float y;
	 public Point()
	 {
		 x=0.0f;
		 y=0.8f;
	 }
	public Point(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	 
}
