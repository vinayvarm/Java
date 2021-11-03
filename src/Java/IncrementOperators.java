package Java;

public class IncrementOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // post increment
		int i=10;
		int j=i++;
		
		System.out.println(j);
		System.out.println(i);
		
		// post increment
		int a=23;
		int b=a++;
		System.out.println(b);
		System.out.println(a);
		
		// pre increment
		int c=45;
		int d=++c;
		System.out.println(d);
		System.out.println(c);
				
		// pre decrement
		int e=34;
		int f=--e;
		
		System.out.println(f);
		System.out.println(e);
		int total=100;
		System.out.println(total++);
		System.out.println(total);
		double s=99.99;
		System.out.println(++s);
		
	}

}
