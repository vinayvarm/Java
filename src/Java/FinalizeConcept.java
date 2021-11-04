package Java;

public class FinalizeConcept {

	
	// gc can delete all the methods in present class
	// if both classes have same method, then gc will destroy both the methods
	// system.gc is uised to destroy the method of same class
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalizeConcept obj= new FinalizeConcept();
		obj=null;
		System.gc();
		System.out.println("bye");
	}

	public void finalize() {
		System.out.println("method");
	}
	
}
