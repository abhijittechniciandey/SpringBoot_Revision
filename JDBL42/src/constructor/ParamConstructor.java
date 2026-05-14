package constructor;

public class ParamConstructor extends Constructor	{
	
	String message;

	public ParamConstructor(String message) {
		//this();//always default constructor called
		this(9);//always int constructor called
		this.message = message;
	}
	
	public ParamConstructor() {
		super();
		System.out.println("This is default constructor");
	}
	
	public ParamConstructor(int a) {
		System.out.println("This is integer constructor");
	}
	

}
