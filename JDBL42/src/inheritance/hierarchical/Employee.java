package inheritance.hierarchical;

public class Employee extends Person{
	
	public Employee() {
		
		System.out.println("Employee Constructor called!");
	}

	int salary;
	String designation;
	
	public void display() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", designation=" + designation + ", id=" + id + ", name=" + name + "]";
	}
	
	

}
