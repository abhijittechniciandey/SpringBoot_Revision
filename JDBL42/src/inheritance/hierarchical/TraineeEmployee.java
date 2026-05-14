package inheritance.hierarchical;

public class TraineeEmployee extends Person{
	
	int tenure;
	
	public void display() {
		super.display();
		System.out.println("Trainee display called:"+this.toString());
	}

	@Override
	public String toString() {
		return "TraineeEmployee [tenure=" + tenure + ", id=" + id + ", name=" + name + "]";
	}

	
	
	

}

