package MethodOverriding;
//parent class
public class Color 
{
	protected Color getColor() 
	{
		Color s = new Color() ;
		
			return s;
		
	}
	 
}
//child class
		class Red extends Color{
			@Override
			protected Red getColor() {
				Red s = new Red();
				return s;
			}
		}
		class Blue extends Color{
			protected Blue getColor()
			{
				Blue s = new Blue();
				return s;
			}
		}