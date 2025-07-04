package Finalkeyword;

public class FinalMethodClass {
	//constructor
	public FinalMethodClass() {
		System.out.println("defualy constructor");
	}
	final int a =20;
	//final method
	final void show() {//if we declare final method we cant override
		
	
			System.out.println("value of a "+ a);
	
	}

}
