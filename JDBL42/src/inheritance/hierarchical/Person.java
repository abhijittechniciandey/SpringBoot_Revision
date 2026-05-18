package inheritance.hierarchical;

public class Person {
	
	int id;
	String name;
	
	public void display() {
		System.out.println(toString());
	}

	public Person() {
		System.out.println("Person Constructor called");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	

}
