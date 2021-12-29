package SuperKeyword;

public class s2 extends s1{
  int var=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            s2 ss= new s2();
            ss.m1();
	}
	@Override
	public void m1() {
		super.m1();
		System.out.println(super.var);
		
		//System.out.println("child method");
	}
}
