package com.oops.inheritance.multilevel;

public class TraineeEmployee extends Employee{
	
	int tenure;
	
	public void display() {
		super.display();
		System.out.println("Trainee display called:"+this.toString());
	}

	@Override
	public String toString() {
		return "TraineeEmployee [tenure=" + tenure + ", salary=" + salary + ", designation=" + designation + ", id="
				+ id + ", name=" + name + "]";
	}
	
	

}

