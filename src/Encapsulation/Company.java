package Encapsulation;

public class Company {

	public String name;
	public int empCount;
	private int sharePrice;
	private String address;
	private boolean isAvailable;
  // private members cannot be accesed outside method
	
   public String getCeoname() {
	   System.out.println("ceo method");
	   return "tom";
   }	
	
   private int getShare() {
	   return  1900;
   }
   
   
   // encapsulation is providing outer details and hiding internal details
   // encapsulation using setters and getters 
   
   public void setprice(int sharePrice) {
	this.sharePrice=sharePrice;   
   }
   
   public int getprice() {
	   return sharePrice;
   }

   
	public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public boolean isAvailable() {
	return isAvailable;
}

public void setAvailable(boolean isAvailable) {
	this.isAvailable = isAvailable;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company c= new Company();
      	String var=c.getCeoname();	
		System.out.println(var);
		c.sharePrice=456;
		c.empCount=34;
		c.name="vinay";
		int sh=c.getShare();
		System.out.println(sh);
	}

}
