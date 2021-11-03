package StaticNonStatic;

public class TestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UsageStaticNon usage=new UsageStaticNon();
		usage.price=67;
		usage.color="white";
		usage.name="brezza";
		
		
		UsageStaticNon usage1=new UsageStaticNon();
		usage1.price=97;
		usage1.color="red";
		usage1.name="dezire";
		
		UsageStaticNon usage2=new UsageStaticNon();
		usage2.price=57;
		usage2.color="yellow";
		usage2.name="benz";
		
		
		System.out.println(usage.price + " " + usage.color+ " "  + usage.name+" " + UsageStaticNon.wheels);
		System.out.println(usage1.price + " " + usage1.color+ " "  + usage1.name+" " + UsageStaticNon.wheels);
		System.out.println(usage2.price + " " + usage2.color+ " "  + usage2.name+" " + UsageStaticNon.wheels);
		usage.getCarinfo();
		UsageStaticNon.steering();
		
	}
}
