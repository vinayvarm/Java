package Oopsconstructor;

public class ConstructorConcept {

    String name;
    int age;
    String dob;
    String city;
    boolean Ispermanent;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// when ever object is created default cons will be executed
        //looks like a function but not function, cons will never return a value : no return keywords in cons 
		//function may return or may not return the values
		
		
		
		ConstructorConcept cc= new ConstructorConcept("vinay");
		System.out.println(cc.name);
      	
		ConstructorConcept cc1= new ConstructorConcept("vikram",12,"23-12-2020","vizag",true);
		System.out.println(cc1.name);
		System.out.println(cc1.age);
		System.out.println(cc1.dob);
		System.out.println(cc1.city);
		System.out.println(cc1.Ispermanent);
			}

//	public ConstructorConcept() {
//		System.out.println("default cons");
//	}
//  	
//	public ConstructorConcept(int a) {
//		System.out.println("cons with a");
//	}
//  	
//	public ConstructorConcept(String name) {
//		System.out.println("cons with string");
//	}
//  	
    public ConstructorConcept() {
    	
    }	
    public ConstructorConcept(String name, int age, String dob, String city, boolean ispermanent) {
	
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.city = city;
		this.Ispermanent = ispermanent;
	}

	public ConstructorConcept(String name) {
    	this.name=name;
    }	
}
