package day4;

public class base {
	//declare default private protected and public variables 
	int varDefault = 10;
	public int varPublic=20;
	private int varprivate = 30;
	protected int varProtected=40;
	
	
	//declare  default  private public protectd methods
	  void methodDefault() {
			System.out.println("Default access base class");
			System.out.println("Default variablr:"+varDefault);
		}

	 public void methodPublic() {
		System.out.println("public access base class");
		System.out.println("public variablr:"+varPublic);
	}
	 private void methodPrivate() {
			System.out.println("private access base class");
			System.out.println("private variablr:"+varprivate);
		}
	 protected void methodProtected() {
			System.out.println("protected access base class");
			System.out.println("protected variablr:"+varProtected);
		}
}
