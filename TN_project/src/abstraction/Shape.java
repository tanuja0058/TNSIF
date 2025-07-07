package abstraction;

public abstract class Shape {
	protected float area;
	
	//abstract method  //it does not requires "{}" body 
	public abstract void calArea();
	
	//solid methos
	public void show() {
		System.out.println("Area of shape is:"+area);
	}

}
