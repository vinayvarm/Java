package Interface;

       
public interface UsMedical {
 
	int minfee=10;

	// interface cannot have method body
	  public void orthoServices(); 
	  public void physioServices();
	  public void cardioServices();
	 public void ser911();
	 
	 
	 // changes after jdk 1.8
	 // static block in 
	 public static void hspAdmin() {
		 System.out.println("hspadmin");
	 }
	 
	 
	 
}
