package StaticNonStatic;

public class ConceptStaticNonStatic {

	String name;
	static int age;
 // non static method
 public void getName() {
	 System.out.println("non static method");
 }	
	// static method
 public static void getInfo() {
	 System.out.println("static method");
 }
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// calling non static variables and methods-- have to create an object
		
		ConceptStaticNonStatic sn =new ConceptStaticNonStatic();
		sn.name="vinay";
		sn.getName();
		
      	// call static methods and variables
		
		System.out.println(age);
		getInfo();
		
		
	}

}
