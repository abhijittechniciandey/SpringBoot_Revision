package com.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Employee {
	String name;
	int id;
	
	public void loadEmployeeFromFile(File f) throws FileNotFoundException {
		Scanner sc = new Scanner(f);
	}
}
