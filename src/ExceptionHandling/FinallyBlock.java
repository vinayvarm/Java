package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // try block with finally block is allowed 
		// finally block will be executed by default
		// generally database close connection will be used in finally block
		/*
		 * try { int i=9/0; System.out.println(i); } catch(ArithmeticException e) {
		 * System.out.println("arthmetic exception"); } // finally block will be
		 * executed always finally { System.out.println("executing finally block"); }
		 */
		
		/*
		 * public static int getMarks(String name) { if(name.equals("tom")) { return 90;
		 * } else if(name.equals("sam")) { try { int i=9/0; } catch(Exception e) {
		 * return 50; } finally { return 10; } } else if(name.equals("sujan")) { return
		 * 95; } return -1;
		 * 
		 * 
		 * }
		 */
		
		// error in try
		
          try {
        	  int i=9/0;
          }		
		  catch(ArithmeticException e) {
              System.out.println("catch block");			  
		  }
          finally {
        	  System.out.println("finally block");
          }
          System.out.println("----------------------------------------------");
          // no error in try block
          try {
        	  int i=9/3;
        	  System.out.println("try block");
          }		
		  catch(ArithmeticException e) {
              System.out.println("catch block");			  
		  }
          finally {
        	  System.out.println("finally block");
          }
          
          System.out.println("----------------------------------------------");
          // error in try block with return keywords
          try {
        	  int i=9/0;
        	  
          }		
		  catch(ArithmeticException e) {
              System.out.println("catch block");			  
		  }
          finally {
        	  System.out.println("finally block");
          }
                    
	}

}
