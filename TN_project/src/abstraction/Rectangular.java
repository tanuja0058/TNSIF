package abstraction;

public class Rectangular extends Shape {
	float width;
	float height;
	
	public Rectangular() {
		width=4.5f;
		height=3.4f;
	}
	public Rectangular(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	public void calArea() {
		this.area=width*height;
		
		
	}
	

}
