package methods;

public class OverloadingMainmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("mm1");
         
         main(567);
         main(567,45,34);
         main(12,"vinay");
         main(34,67);
         
	}	
		public static void main(int a) {
			System.out.println("main method2");
		}
   
		
		public static void main(int a, int g,int d) {
			System.out.println("main method3");
		}
   
		
		public static void main(int a, String b) {
			System.out.println("main method4");
		}
   
		
		public static void main(int a, int c) {
			System.out.println("main method5");
		}
   
		
	

}
