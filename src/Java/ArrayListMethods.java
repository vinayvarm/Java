package Java;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // list of methods for arraylist 
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("vinay");
		al.add("vijay");
		al.add("vikram");
		al.add("vikranth");
		// it will print array list
		System.out.println(al);
		// size method gives size of array list
		System.out.println(al.size());
		// clear method will make arraylist empty
		al.clear();
		System.out.println(al.size());
		// copying of array list al1 to al2
		
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("A");
		al1.add("B");
		al1.add("C");
		al1.add("D");
		al1.add("E");
	    System.out.println("array list1 is" + al1);
        	    
		ArrayList<String> al2=  (ArrayList<String>)al1.clone();
		System.out.println("array list2 is"+ al2);
		// contains 
	   
		System.out.println(al1.contains("B"));
		System.out.println(al1.indexOf("B"));
		
		// to increase capacity 
		
		//System.out.println(al1.ensureCapacity(20));
		
		//for each: jdk 1.8 with lamda 
		
		al1.forEach(e->System.out.println(e));
		al1.forEach(e->System.out.println(e.toLowerCase()));
		
		ArrayList<String> emplist= new ArrayList<String>();
		emplist.add("tom");
		emplist.add("peter");
		emplist.add("naveen");
		emplist.add("daisy");
		
		Collections.sort(emplist);
	    System.out.println(emplist);
	    Collections.sort(emplist,Collections.reverseOrder());
	    System.out.println(emplist);
	}

}
