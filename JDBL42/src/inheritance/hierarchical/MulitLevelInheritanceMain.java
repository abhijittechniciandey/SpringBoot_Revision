package inheritance.hierarchical;

public class MulitLevelInheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TraineeEmployee trainee = new TraineeEmployee();
		trainee.id=1;
		trainee.name="Trainee";
		trainee.tenure=6;
		
		trainee.display();
		
		System.out.println("*************Test************");
		
//		Person p = new Person();
//		
//		System.out.println("*************************");
//		
//		Person p1 = new Employee();
//		
//		System.out.println("*************************");
//		
		Employee e = new Employee();
		e.salary=0;
		try {
			
			System.out.println("The Per day cost:"+30/e.salary);
			
		}
		
		catch(Exception exp) {
			exp.printStackTrace();
		}
		
		
		System.out.println("*************************");
		
		

	}

}
