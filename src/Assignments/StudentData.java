package Assignments;

public class StudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// need to store studentname,age,team name,dob,gender,strike rate,isActive
		
		Object[] obj= {"vinay",12,"india","12-09-2021",'M',134.67,true};
		Object[] obj1= {"vijay",11,"southafrica","11-03-2022",'F',164.67,false};
		
		System.out.println("lenght is "+ obj.length);
		// print values using for each loop 
		System.out.println("==========================================");
		for (Object val:obj) {
			System.out.println(val);
			
		}
		System.out.println("==========================================");
		for (Object val1:obj1) {
			System.out.println(val1);
			}
		System.out.println("==========================================");
	  // print using for loop
		
		for (int i=0;i<obj.length;i++) {
			  System.out.println(obj[i]);
		}
		System.out.println("==========================================");
		for(int j=0;j<obj1.length;j++) {
			System.out.println(obj1[j]);
		}
	}

}
