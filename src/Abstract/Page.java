package Abstract;

public abstract class Page {

// cannot crate object for abstract class 
// 	
public abstract void title();
public abstract void url();
public abstract void loading();


public void header() {
	System.out.println();
	
}
public static final void logo() {
	System.out.println();
}

}
