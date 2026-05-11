package com.oops.inheritance.single;

public class SingleInheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee();
		employee.id=1;
		employee.name="Aditya";
		employee.salary=100000;
		employee.designation="Enginner";
		
		employee.display();
		
		Person person = new Person();
		person.id=1;
		person.name="Abhijit";
		
		person.display();

	}

}
