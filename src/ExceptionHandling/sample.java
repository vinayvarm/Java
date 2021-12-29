package ExceptionHandling;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			int i=9;
			System.out.println(i/0);
		}
		catch(ArithmeticException e) {
			//System.out.println("cathing exception");
		}
		
		
	}

}
