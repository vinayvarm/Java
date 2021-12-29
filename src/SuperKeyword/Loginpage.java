package SuperKeyword;

public class Loginpage extends Page {

	
	int loading=20;
	
	Loginpage(){
		super();
		System.out.println("child constructor");
		
	}
	
	void load() {
		System.out.println("child loading is" + loading);
		System.out.println("parent loadingtime is"+ super.loading);// accessing parent class variable
		pageTitle();
		super.pageTitle();// accessing parent class method with super keyword
	}
	@Override
	public void pageTitle() {
		System.out.println("child class method");
	}

	
}
