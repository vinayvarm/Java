package ExceptionHandling;

public class TryCatchBlock {
   
	
	// if any issue in try block, control will jump to catch block, it will not check other lines in try block
	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("outside try block");
  

try {
	int i=9/0;
	System.out.println(i);
}
catch(ArithmeticException e) {
	System.out.println("arithmatic exception");
	e.printStackTrace();
}
catch(NullPointerException e) {
System.out.println("null pointer");
}
	}

}
