package SuperKeyword;

public class Page {

	
	Page(){
	System.out.println("parent cons");	
	}
	
	int loading=30;
	
	// super keyword is used to access parent class methods and variables 
	// super keyword is used for constructor too
	// when we declare super(); in constructor, then it calls parent cons first and then it calls child cons next
	// with super keyword, by giving parametrs in super keyword, we call parent method
	public void pageTitle() {
		System.out.println("parent class method");
	}
	
}
