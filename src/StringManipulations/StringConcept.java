package StringManipulations;

public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="this is my java code and iam so happy";
		System.out.println(str.length());
		
		int len=str.length();
		int li=0;
		System.out.println(li);
		int hi=len-1;
		System.out.println(hi);
		System.out.println(str.charAt(8));
		System.out.println(str.charAt(3));
		System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf("s", 4));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		// 3rd occurance of 's' is 
		
		int value=str.indexOf('s',str.indexOf('s')+1);
		System.out.println(value);
		System.out.println(str.indexOf('s', str.indexOf('s')+value));
		System.out.println(str.charAt(29));
		System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf('i', str.indexOf('i')+1));
		int thirdvalue=str.indexOf('i', str.indexOf('i')+1);
		System.out.println(thirdvalue);
		System.out.println(str.indexOf('i', str.indexOf('i')+thirdvalue));
		System.out.println(str.lastIndexOf("i"));
		// trim 
		String s= "  hello world ";
		System.out.println(s);
		
		System.out.println(s.trim());
		
		// replace
		String dob="01-01-1990";
		System.out.println(dob.replace('-', '/'));
		
		String s1="hello java iam happy with java";
		System.out.println(s1.replace("java","python"));
		
		// contains
		String s2="welcome vinay";
		System.out.println(s2.contains("vinay"));
		
		// concat 
		String s3="hello";
		String s4="selenium";
		String s5=" ";
		String s6="Hello";
		System.out.println(s3.concat(s5).concat(s4));
		// comparision 
	   System.out.println(s3.equals(s6));
		// comparision ignore case
		System.out.println(s3.equalsIgnoreCase(s6));
		// substring 
		String s7="this is my order id 12345";
		System.out.println(s7.substring(11));
		System.out.println(s7.substring(0, 7));
		System.out.println(s7.substring(20));
		System.out.println(s7.substring(s7.indexOf("id")+3,s7.length()));
		
		// split
		
		String test= "java;python;javacript;ruby";
		String a[]=test.split(";");
		System.out.println(a[0]);
		for(String e:a)
		{
			System.out.println(e);
		}	
		
		
	}

}
