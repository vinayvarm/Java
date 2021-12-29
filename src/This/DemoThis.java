package This;

public class DemoThis {

int x;
int y;

// access global variables use this 
// call method with in another method us this
// create constructor and access the instant variables

public DemoThis(){
	System.out.println("demo constructor");
}

public DemoThis(int x, int y)
{
	this.x=x;
	this.y=y;
	System.out.println(x+y);
	}

  public static void main(String a[]) {
        DemoThis dt= new DemoThis(6,6);
      
  }
public void m1() {
	int x=20;
	int y=40;
	System.out.println(this.x+this.y);
	System.out.println(x+y);
	m2();
}
public void m2() {
	int x=20;
	int y=40;
	System.out.println(this.x+this.y);
	System.out.println(x+y);
}
}
