package Inheritance;

public class Car extends Vehicle{
	
	static int i=10;
	// final keyword before method, that  method cannot be over ridden
	// final keyword before class, that class cannot be inherited
	public void  start() {
		System.out.println("start");
	}
	
public void stop() {
	System.out.println("stop");
}

public void refuel() {
	System.out.println("refuel");
}

public static void sunRoof() {
	System.out.println("sunroof");
}

}
