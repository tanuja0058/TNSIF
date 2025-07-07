package abstraction;

public class Square extends Shape {
	
	float side;
	
	public Square() {
		side=4.4f;
		
	}
	

	public Square(float side) {
		super();
		this.side = side;
	}


	@Override
	public void calArea() {
		this.area=side*side;
		
	}
	

}
