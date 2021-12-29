package StringManipulations;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     revstring("vinay");
    
	  // StrinBuffer--- we can reverse the string using string buffer 
     
     String b1="hello";
     StringBuffer sb= new StringBuffer(b1);
     // using direct reverse
     System.out.println(sb.reverse());
     StringBuffer sb1=sb.reverse();
     System.out.println(sb1);
	}

	public static void revstring(String value) {
		int len=value.length();
		//System.out.println(len);
		String rev="";
		 // int j=str.length(); System.out.println(str.length());
		 
	    
	    
	    for(int i=len-1;i>=0;i--) {
	    	rev=rev + value.charAt(i);
	   
	    }
	    System.out.println(rev);   

	}
	
	
}
