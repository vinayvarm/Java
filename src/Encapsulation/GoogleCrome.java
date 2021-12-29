package Encapsulation;

public class GoogleCrome {

	
	public void launchChrome() {
		System.out.println("launchChrome");
		// all the below are privte methods user cannot see their implementation
		checkRam();
		checkCompa();
		checkOs();
	}
	private void checkRam() {
		System.out.println("checkRam");
	}
	private void checkCompa() {
		System.out.println("checkCompa");
	}
	private void checkOs() {
		System.out.println("checkOs");
	}
	
	
}
