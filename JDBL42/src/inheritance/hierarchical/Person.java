package inheritance.hierarchical;

public class Person {
	
	int id;
	String name;
	
	public void display() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	

}
