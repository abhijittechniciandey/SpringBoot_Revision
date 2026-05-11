package com.oops.inheritance.multilevel;

public class MultiLevelInheritenceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TraineeEmployee traineeEmployee = new TraineeEmployee();
		
		traineeEmployee.id=1;
		traineeEmployee.name="Sumana";
		traineeEmployee.designation="Asistant Manager";
		traineeEmployee.tenure=5;
		traineeEmployee.salary=12000;
		
		
		traineeEmployee.display();
		
		
		Employee employee =new Employee();
		
		employee.id=2;
		employee.name="Abhijit";
		employee.designation="Enginner";
		employee.salary=100000;
		
		employee.display();
		
		Person person = new Person();
		
		person.id=4;
		person.name="Ajit";
		
		person.display();

	}

}
