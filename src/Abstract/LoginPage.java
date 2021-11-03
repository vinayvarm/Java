package Abstract;

public class LoginPage extends Page{

	@Override
	public  void title() {
	  System.out.println("overridden title method");   	
	}
	@Override
	public  void url() {
		System.out.println("overridden url method");	
	}
	@Override
	public  void loading() {
		System.out.println("overridden loading method");
	}
	
	
	public void doLogin(String username, String pwd) {
		System.out.println("login with" + username + pwd);
		
	}
	
	public static void main(String a[]) {
         LoginPage lp= new LoginPage();
         lp.url();
         lp.loading();
         lp.title();
         lp.doLogin("vin", "vhd");
         Page.logo();
         
         Page pp=new LoginPage();
         pp.header();
         pp.url();
         pp.title();
         
	}
}
