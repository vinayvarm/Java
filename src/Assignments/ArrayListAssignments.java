package Assignments;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// 1. Write a Java program to create a new array list, add some colors (string) and print out the collection
		
		ArrayList<String> colors= new ArrayList<String>();
		
		// adding colors to the collection
		
		colors.add("Red");
		colors.add("Green");
		colors.add("White");
		colors.add("Yellow");
		colors.add("Black");
		colors.add("Blue");
		System.out.println(colors);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
  
	// 2. Write a Java program to insert an element into the array list at the first and last positions.		
		
		
		ArrayList<Integer> num= new ArrayList<Integer>();
		System.out.println(num.size());
		num.add(0, 34);
		num.add(12);
		num.add(24);
		num.add(23);
		num.add(22);
		num.add(5, 56);
		System.out.println(num);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
   // 3. Write a Java program to retrieve an element (at a specified index) from a given array list.	
		
		ArrayList<Integer> numb= new ArrayList<Integer>();
		numb.add(12);
		numb.add(24);
		numb.add(23);
		numb.add(22);
		System.out.println(numb);
		System.out.println(numb.get(3));
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	//	4. Write a Java program to update specific array element by given element.	
		
		ArrayList<Integer> numbe= new ArrayList<Integer>();
		numbe.add(2);
		numbe.add(4);
		numbe.add(3);
		numbe.add(5);
		numbe.add(5);
		System.out.println("before set"+numbe);
		System.out.println(numbe.set(0, 22));
		System.out.println("after set" +numbe);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	// 	5.Write a Java program to remove the third element from a array list. 
		
		ArrayList<Integer> number= new ArrayList<Integer>();
		number.add(20);
		number.add(40);
		number.add(30);
		number.add(50);
		number.add(58);
		System.out.println("before remove"+number);
		System.out.println(number.remove(2));
		System.out.println("after remove" +number);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");		
		
	// 6. Write a Java program to search an element in a array list.	
		
       ArrayList<String> color= new ArrayList<String>();
		
		// Search element in arraylist using Contains method
		
		color.add("Red");
		color.add("Green");
		color.add("White");
		color.add("Yellow");
		color.add("Black");
		color.add("Blue");
		System.out.println(color);
		System.out.println(color.contains("fdgdfg"));
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
	// 	 7. Write a Java program to reverse elements in a array list
	  ArrayList<String>	name= new ArrayList<String>();
	  name.add("vinay");
	  name.add("ajay");
	  name.add("mahesh");
	  System.out.println("Before sort"+name);
	  Collections.sort(name,Collections.reverseOrder());
	  System.out.println("After sort" +name);
	  Collections.sort(name);
	  System.out.println(name);
	  
	  
	  
	  

//8. Write a Java program to extract a portion of a array list.
//9. Write a Java program of swap two elements in an array list.
//10. Write a Java program to empty an array list.
//11. Write a Java program to trim the virtual capacity of an array list the current list size.
//12. Write a Java program to print all the elements of a ArrayList using the position of the elemen
	  
	  
	  
	  
	  
	}
	

}
