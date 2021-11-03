package BuilderPattern;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // normal method create object and access
		
		EcomApp app= new EcomApp();
		app.addTocart("ttt");
		app.doPayment("dff", "dff");
		
     // using build pattern 
		
		app.login("un", "23454").doResearch("maggi").selectProduct("maggi").addTocart("added").doPayment("un", "psw").logout().genid();
		
	}

}
