package InterfaceRealtimeExample;

public class TestInt {

	
	static WebDriverRules driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String browser="chrome";
		
		if(browser.equals("chrome")) {
			driver= new GoogleChrome();
		}
		else if(browser.equals("IE")) {
			driver=new IE();
		}
		driver.getTitle();
		driver.getUrl();
		driver.getBrowser();
		driver.quit();
	}

}
