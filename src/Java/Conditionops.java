package Java;

public class Conditionops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=10;
       int b=10;
		if(a==b) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("not equal");
		}

		String s1="selenium";
		String s2="Selenium";
		
		if(s1==s2) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("not equal");
		}
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("both are equal");
		}
		// if-else 
		int marks=60;
		if(marks>=60) {
			System.out.println("A");
			if(marks<=80) {
				System.out.println("B");
		        if(marks<=60) {
		        	System.out.println("c");
		        }		
			}
		else {
				System.out.println("Fail");
			} 	
		}
		
		// is-elseif
		
		String browser="chrome";
		
		switch(browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "ie":
			System.out.println("launch ie");
			break;
		case "firefox":
	        System.out.println("launch firefox");	
	        break;
	        
	        
	    default:
	    	System.out.println("wrong input");
	    	break;
		}
		// find greatest number
		
		int x=27;
		int y=65;
		int z=123;
		
		if (x>y && x>z) {
			System.out.println("x is great");
		}
		else if (y>z) {
			System.out.println("y is greatest");
		}
		else {
			System.out.println("z is greatest");
		}
		double d1=12.33;
		double d2=12.33;
		if(d1==d2) {
			System.out.println("pass");
        }
		else {
			System.out.println("fail");
		}
		
		char c1='a';
		char c2='a';
		if (c1==c2) {
			System.out.println(c1);
			
		}
		else {
			System.out.println("not equal");
		}
		
		// switch for numeric
		int g=20;
		
		switch(g) {
		case 1:
			System.out.println("case 1");
			break;
			
		case 20:
			System.out.println("case 20");
			break;
			
		default: 
			System.out.println();			
		    break; 
			
			
			
			
		}
		
		System.out.println("overall statement");
		
		
		}
		
	}

	

