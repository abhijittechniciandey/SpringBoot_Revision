package com.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandlingMain {

	public static void main(String[] args) throws InvalidAgeException {
		
//		File f = new File("abc.txt");
//		f.exists();
//		
//		try {
//			System.out.println("Inside try block");
//			Scanner scanner = new Scanner(f);
//		}
//		catch(FileNotFoundException e){
//			e.printStackTrace();
//		}
//		
//		System.out.println("Outside of try Block");

//		Employee e = new Employee();
//		try {
//			e.loadEmployeeFromFile(new File("abc.txt"));
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
//		try {
//			System.out.println("In try");
//			throw new Exception("Test Exception");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("FInally Block");
//		}
		
		Employee employee = new Employee();
		int age=17;
		if(age<18) {
			throw new InvalidAgeException("Age cant be less than 18"+age);
		}
		else {
			employee.age=age;
			System.out.println(employee);
		}
	}

}
