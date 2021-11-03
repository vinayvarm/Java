package methods;

import java.util.ArrayList;

public class Company {
	
	String name;
	int empCount;

	public String getCeoname() {
		System.out.println("getname method");
		return "tom";
	}
	public int getCount() {
		System.out.println("count method");
		int share=34;
		return share;
	}
	
	public String[] getFounders() {
       System.out.println("founders method");
       String[] members= {"vinay","vijay","vikram"};
       return members;
	}
	
	
	public ArrayList<String> getCustomer() {
		ArrayList<String> cust= new ArrayList();
		cust.add("nesle");
		cust.add("parle");
		cust.add("abhi");
		return cust;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company com= new Company();
		System.out.println(com.getCeoname());
		System.out.println(com.getCount());
		// System.out.println(com.getFounders());
		String[] foundcount=com.getFounders();
		
		//System.out.println(foundcount);
		System.out.println(foundcount.length);
		for (String e:foundcount) {
			System.out.println(e);
		}
		System.out.println(com.getCustomer());
		
		
	}

}
