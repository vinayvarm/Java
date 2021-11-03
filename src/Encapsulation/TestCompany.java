package Encapsulation;

public class TestCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Company c1= new Company();
		c1.name="ty";
		c1.empCount=45;
		c1.getCeoname();
		c1.setprice(100);
		int pr=c1.getprice();
		System.out.println(pr);
		c1.setAddress("usa");
		String addr=c1.getAddress();
		System.out.println(addr);
		c1.setAvailable(true);
		boolean b=c1.isAvailable();
		System.out.println(b);
	}

}
