package methods;

public class Methods {
       // java never store static variables or methods
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methods me= new Methods();
		
		int p=me.test();
		System.out.println(p);
        String name=me.test1();
        System.out.println(name);
        int val=me.sum(10,20 );
        System.out.println(val);
        
	}

	public int test() {
		System.out.println("executing method");
			int a=80;
		/*
		 * int b=20; int c=a+b;
		 */
		//System.out.println(c);
		return a;
	}
	public String test1() {
		String s1="vinay";
		return s1;
	}
	
	public int sum(int j,int k) {
	
	int z=j+k;
	
	return z;
	}
	
}
