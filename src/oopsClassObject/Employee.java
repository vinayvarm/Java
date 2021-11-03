package oopsClassObject;

public class Employee {
	
	String name="vinay";
	 int age=56;
	double salary=7777;
	boolean isActive=true;
  // objects will be stored in heap memory 
  // reference variables will be stored in stack memory	
  // garbage collector will delete objects which are not having reference values and which are having null value
  // System.gc();--checks with jvm to go into heap memory
	// gc is only for heap memory not stack memory
	// Null pointer exception-- if refernce variable is assigned to null then trying to access null values, then NPE will come
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee emp1= new Employee();
		
		System.out.println(emp1.age);
		System.out.println(emp1.name);
		System.out.println(emp1.salary);
		System.out.println(emp1.isActive);
		
		 Employee emp2= new Employee();
		  emp2.age=34;
		  emp2.name="vin";
		  emp2.salary=45555;
		  emp2.isActive=true;
          emp1=emp2;

  		System.out.println(emp2.age);
  		System.out.println(emp2.name);
  		System.out.println(emp2.salary);
  		System.out.println(emp2.isActive);

  		System.out.println(emp1.age);
		System.out.println(emp1.name);
		System.out.println(emp1.salary);
		System.out.println(emp1.isActive); 
  		
  		
		 Employee emp3= new Employee();
		
	}

}
