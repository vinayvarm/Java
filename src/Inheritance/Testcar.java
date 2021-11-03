package Inheritance;

public class Testcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Bmw bm= new Bmw();
        bm.start(); // over ridden method
        bm.stop(); // inherited method
        bm.refuel(); // inherited method
        bm.AutoParking();
        bm.engine();
        System.out.println(Bmw.i);
        Car.sunRoof();
        Car c= new Car();
        c.start();
        c.stop();
        c.refuel();   
        
      // top casting 
        
        Car c1= new Bmw();
        c1.start();
        c1.stop();
        c1.refuel();
        c1.engine();
		/*
		 * // down casting
		 * 
		 * Bmw b1=(Bmw)new Car();
		 */
	}

}
