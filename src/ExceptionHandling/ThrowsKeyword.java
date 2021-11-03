package ExceptionHandling;

public class ThrowsKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//throws keywords throws exceptions pass exceptions from one method to another method
		
		
		
	}

	public void m1() {
		System.out.println("m1");
	}
	public void m2() {
		System.out.println("m2");
		m3();
	}

	public void m3() throws ArithmeticException {
		System.out.println("m3");
		m4();
	}

	public void m4() throws ArithmeticException {
		System.out.println("m4");	
		m5();
	}

	public void m5() throws ArithmeticException {
		System.out.println("m5");
		int i=9/0;
	}

	
}
