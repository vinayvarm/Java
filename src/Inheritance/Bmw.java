package Inheritance;

import java.util.concurrent.Flow.Publisher;

public class Bmw extends Car{
      
	// when parent and child having same method name and same number of params then it is method over riding 
//	@Override
	
	public void start() {
	System.out.println("bmw-new start");
	}
	public void AutoParking() {
		System.out.println("bmw-autoparking");
	}
	// cannot over ride a static method 
	/*
	 * @Override public static void sunRoof() { System.out.println("bwm-sunroof"); }
	 */
}
