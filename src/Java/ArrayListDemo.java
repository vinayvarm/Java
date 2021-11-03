package Java;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// ArrayList is a class and dynamic array
		// index based collection
		// length is defined by size function
		ArrayList ar= new ArrayList();
		System.out.println(ar.size());
		// when we declare array list default virtual capacity(empty blocks) is 10 and physical capacity is 0
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		
	    System.out.println("size"+ ar.size());
		
		ar.add(500);
		ar.add(600);
		ar.add(700);
		ar.add(800);

		  System.out.println("size"+ar.size());
		
		ar.add(900);
		ar.add(1000);
		ar.add(1100);
		ar.add(1200);
		
		  System.out.println("size"+ar.size());
		ar.add(1300);
		ar.add(1400);
		ar.add(1500);
		ar.add(1600);
		 System.out.println("size"+ar.size());
		 // printing all values using for loop 
		 
		 for (int i=0; i<ar.size();i++) {
			 System.out.println(ar.get(i));
		 }
		 System.out.println("==========================");
		 // print all values using for each loop 
		 
		 for (Object num: ar) {
			 System.out.println(num);
		 }
		 System.out.println("==========================");
		 
		 // creating object arraylist which accepts all data types
		 
		 ArrayList<Object> ob= new ArrayList<Object>();
		 
		 ob.add("vinay");
		 ob.add(29);
		 ob.add(12.56);
		 
		 System.out.println(ob.get(1));
		 System.out.println(ob);
        // creating arraylist which accepts only integer values
		 ArrayList<Integer> marks= new ArrayList<Integer>();
		 marks.add(23);
		 marks.add(45);
		 System.out.println(marks.get(1));
	
		// creating arraylist which accepts only string values
		 
		 ArrayList<String> studentlist= new ArrayList<String>();
		 studentlist.add("micheal");
		 studentlist.add("mich");
		 studentlist.add("eal");
		 studentlist.add("mil");
		 studentlist.add("ea");
		 studentlist.add("mic");
		 studentlist.add("miche");
		 System.out.println(studentlist.get(0));
		 
		 for(int i=0;i<studentlist.size();i++) {
			 System.out.println(studentlist.get(i));
		 }
		 
		 for(String name:studentlist) {
			 System.out.println(name);
		 }
	}

}
