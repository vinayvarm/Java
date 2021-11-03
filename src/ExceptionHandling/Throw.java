package ExceptionHandling;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			throw new Exception("excel blank exception");
		}
		catch(Exception e) {
			System.out.println("some exception");
			e.printStackTrace();
		}
		
		
	}

}
