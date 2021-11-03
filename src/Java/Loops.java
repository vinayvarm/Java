package Java;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. while loop
       int i=0;
       int n=5;
		while(i<n) {
			System.out.println(i);
			i++;
		}
		
	
		/*
		 * // printing infinite loop
		 * 
		 * while(true) { System.out.println("infinite loop"); }
		 */

		// for loop 
		
		for (int k=0;k<n;k++) {
			System.out.println(k);
			
		}
		// printing a to z 
		
		for(char c='a';c<='z';c++) {
			System.out.println(c); 
		}
		
		/*
		 * for(;;) { System.out.println("executing loop  with no conditions"); }
		 * 
		 */	/*
		 * boolean flag=false; while (flag) { System.out.println("hi"); }
		 */
		// do while loop
	int p=1;
      do {
    	  System.out.println("exe do loop");
    	  p++;
      }		
	 while(p<=10);	
      System.out.println("===================================================="); 
      // for loop print even upto 10 
      
      for(int even=2;even<=10;even++) {
    	  if(even%2==0) {
    		  System.out.println(even);
    	  }
    	  
    	 }
      System.out.println("====================================================");
      // for loop print even upto 10 using ++ operators
     
      for(int even=2;even<=10;even=even+2) {
    	  System.out.println(even);
      }
      System.out.println("====================================================");
      // print odd numbers 
     
      for (int d=1;d<=10;d=d+2) {
    	  System.out.println(d);
      }
      System.out.println("====================================================");
  // print 1 to 100 and print HI for every 5 divisible     
 
      for(int num=1;num<=100;num++) {
    	  System.out.println(num);

    	if(num%5==0) {
    		System.out.println("hi");
    	}
      }
      
}
}