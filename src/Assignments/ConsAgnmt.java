package Assignments;

import java.util.ArrayList;

public class ConsAgnmt {

	
	/*
	 * Constructor Assignments: 1. Design a University class template with the
	 * following features:  variables: name﻿ country stablishedDate List of course
	 * provided in Array List<String>
	 * 
	 * 
	 * --Design the constructor of this class with different parameters and all
	 * parameters.
	 * 
	 * 
	 * --Write the get method of each variable with return keyword. 
	 * 
	 * 
	 * 2. Design a browser class template with the following features:  variables:
	 * browserName vendorName currentVersion List of plugins supported by Browser in
	 * Array List<String>
	 * 
	 * 
	 * --Design the constructor of this class with different parameters and all
	 * parameters.
	 * 
	 * 
	 * --Write the get method of each variable with return keyword. 
	 * 
	 */	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		University un= new University("Texas University");
		System.out.println(un.name);
		
		University un1= new University("Texas University","USA");
		System.out.println(un1.name + " " +un1.country);
		
		University un2= new University("Texas University","USA","12-12-2020");
		System.out.println(un2.name + " " +un2.country + " "+ un2.establisheddate);
		
		ArrayList<String>subjects=new ArrayList();
		subjects.add("java");
		subjects.add("python");
		subjects.add("csharp");
		subjects.add("ruby");
		
		University un3= new University("Texas University","USA","12-12-2020",subjects);
		System.out.println(un3.name + " " +un3.country + " "+ un3.establisheddate + " "+ un3.courses);
	
		System.out.println(un3.courses.get(0));
		System.out.println(un3.courses.get(1));
		System.out.println(un3.courses.get(2));
		System.out.println(un3.courses.get(3));
		
		
		
		
	}

}
