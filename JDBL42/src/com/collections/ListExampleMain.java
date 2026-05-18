package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListExampleMain {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Abhijit");
		list.add("Sumana");
		list.add("Sukanya");
		list.add("Pooja");
		
		System.out.println(list.size());
		System.out.println(list.get(0));
		
		System.out.println("+++++++++++++++++++++++++++++++++++");
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		Collections.sort(list);
		System.out.println("Sorted list"+list);
		
		Collections.shuffle(list);
		System.out.println("shuffled list"+list);
		
		
		

	}

}
