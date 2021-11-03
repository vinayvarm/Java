package Encapsulation;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3 ways to access class variables 
		
		//1. create object access using reference variable
		
		User us= new User();
		us.age=34;
		us.id=23;
		us.name="vinay";
		System.out.println(us.age);
		System.out.println(us.id);
		System.out.println(us.name);
		
		//2. create constructor and assign parameters 
		
		User us1= new User("vikram",12,45);
		System.out.println(us1.age);
		System.out.println(us1.id);
		System.out.println(us1.name);
		
		// 3. creaate setters and getters and assign values
		
		User us2= new User();
		us2.setAge(34);
		us2.setId(66);
		us2.setName("vijay");
		// 2 ways to get value 
		int ag=us2.getAge();
		System.out.println(ag);
		
		String nm=us2.getName();
		System.out.println(nm);
		int ide=us2.getId();
		System.out.println(ide);
    // getting a value		
		System.out.println(us2.name);
		System.out.println(us2.age);
		System.out.println(us2.id);
		
	}

}
