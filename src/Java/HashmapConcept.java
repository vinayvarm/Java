package Java;

import java.util.HashMap;

public class HashmapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//key-value 
        // never store the values based on indexing 
		// stores based on key pair 
		// virtual capacity of hashmap is 16 and array list is 10
		// does not maintain order 
		
		HashMap<String,String> empmap= new HashMap<String,String>();

		empmap.put("A", "TOM");
		empmap.put("B", "JIM");
		empmap.put("C", "TIM");
		empmap.put("D", "KIM");
		
       System.out.println(empmap.get("C"));		
       System.out.println(empmap.size());
	}

}
