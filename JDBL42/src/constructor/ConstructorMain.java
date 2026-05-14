package constructor;

public class ConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor c = new Constructor();
		c.message="Abhijit";
		System.out.println(c.message);
		
		ParamConstructor pc = new ParamConstructor("Sumana");
		System.out.println(pc.message);
		
		ParamConstructor pc1 = new ParamConstructor();
		pc1.message="This message";
		System.out.println(pc1.message);

	}

}
