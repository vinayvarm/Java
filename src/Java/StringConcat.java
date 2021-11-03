package Java;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=100;
		int b=200;
		
		String x="hello";
		String y="world";
		
		System.out.println(a+b);
        System.out.println(x+y);
        System.out.println(a+b+x+y);
        System.out.println(x+y+a+b);
        System.out.println(x+y+(a+b));
        char c='a';
        char c1=8;
        System.out.println(c+c1);
        // when performing operations, ascii valves will be assigned
        // Ascii values range 
        // A-Z: 65-90
        // a-z: 97-122
        // 0-9: 48-57
        System.out.println(c);
        System.out.println(c1);
        System.out.println(0/2);
        System.out.println(2/0);
        
	}

}
