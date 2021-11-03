package Interface;

public class TestInterface  implements UsMedical, UkMedical,IndiaMedical{

	
	
	
	
	 @Override
	 public void orthoServices() {
          System.out.println("ortho");		 
	 }
	 @Override
	  public void physioServices() {
		System.out.println("physio");  
	  }
	  @Override
	  public void cardioServices() {
		System.out.println("cardio");  
	  }
	  @Override
	  public void pediaServices() {
		  System.out.println("pedia servies");
	  }
	  @Override	  
		public void entService() {
			System.out.println("ent service");
		} 
	  @Override	  
	  public void gynoServices() {
		  System.out.println("gyno");
		  }
	  @Override	  
		public void nueroServices() {
			System.out.println("nuero");
			  	}
	  @Override	  
		public void oncologyServices() {
			System.out.println("oncology");
			}
	@Override
	public void ser911() {
		System.out.println("911");
		
	}
	  
	
	public void ownServices() {
		System.out.println("own services");
	}
	
	public void pathServiecs() {
		System.out.println("path");
	}
	
	
	public static void main(String a[]) {
		TestInterface ti= new TestInterface();
		ti.orthoServices();
		ti.physioServices();
		ti.ser911();
		ti.cardioServices();
		ti.pediaServices();
		ti.entService();
		ti.gynoServices();
		ti.nueroServices();
		ti.oncologyServices();
		UsMedical.hspAdmin();
		//ti.bill();
	}
	
	
	
}
