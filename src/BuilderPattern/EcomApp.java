package BuilderPattern;

public class EcomApp {

	
	// build pattern used to call methods in chain pattern
	// can ba called in any order
	public EcomApp login() {
		System.out.println("default login");
		return this;
	}
	
	public EcomApp login(String un,String pwd) {
		System.out.println("login with" + un+pwd);
		return this;
		}

    public EcomApp doResearch(String prodname) {
    	System.out.println("search with" + prodname);
    	return this;
    }	
    public EcomApp doResearch(String prodname,int price) {
    	System.out.println("search with" + prodname + price);
    	return this;
    }
    public EcomApp selectProduct(String prodname) {
    	System.out.println("selecting product" + prodname);
    	return this;
    }
    public EcomApp addTocart(String prodname) {
    	System.out.println("adding to cart" + prodname);
    	return this;
    } 
    public EcomApp doPayment(String accountname,String pwd) {
    	System.out.println("payment with" + accountname+ pwd);
    	return this;
    }
    public EcomApp logout() {
    	System.out.println("logout");
    	return this;
    }
    public int genid() {
    	System.out.println("id is");
    	return 200;
    }
}
