package methods;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // method overloading is with in same class 
      // different methods with same name and different parameters
	// reusability 	
		LoginPage lp= new LoginPage();
		lp.login(12333);
		lp.login("vinay", "password");
	}
	
	public void login() {
		 System.out.println("login method without parametrs");
	}
	public void login(int a) {
		 System.out.println("login method with parametrs");
	}
	
	public void login(int a, int b) {
		 System.out.println("login method with 2 parametrs");
	}
	
	public void login(int a, String b) {
		 System.out.println("login method with 2 different parametrs");
	}
	public void login(String un,String pwd) {
		System.out.println("login with username and pswd");
	}
	
	// example 2 
	
	public void search() {
		
	}
   public void search(String product) {
		
	}
  public void search(String name,int y) {
	
  }
   public void search(String name,int y,String color) { 
	
    }
	
	
	
	
	
	
	

}
