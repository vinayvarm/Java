package StaticNonStatic;

public class UsageStaticNon {

	// example for a car
	
	int price;
	String color;
	String name;
	static int wheels=4;
	
public static void steering() {
	System.out.println("steering method");
}

public void getCarinfo() {
	System.out.println("car info method");
}
}
