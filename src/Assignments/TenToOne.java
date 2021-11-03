package Assignments;

public class TenToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     // using for loop print 10 to 1 		
		
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		System.out.println("=========================");
		  // using while loop print 10 to 1 	
		int i=10; int n=1;
		while(i>=n) {
			System.out.println(i);
			i--;
		}
		
		System.out.println("=========================");
		// using do while printing 10 to 1
         int j=10;
         int k=1;
		do {
			System.out.println(j);
			j--;
		}
		while(j>=k);
	 // print hello world ten times using while loop 
		
		int a=1; int b=10;
		while(a<=b) {
			System.out.println("Hello World");
			a++;
		}

		System.out.println("======================");
		
		// print 1 to 10 using while, and quit at 7 multiple
		
	    int c=1;	
		int d=10;
		
		while(c<=d) {
			System.out.println(c);
			
			if(c%7==0) {
				break;
			}
			c++;
		}
		
		
		
	}

}
