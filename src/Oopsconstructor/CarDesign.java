package Oopsconstructor;

import java.util.ArrayList;

public class CarDesign {


		String name;
		String color;
		int price;
		double mileage;
		char isAvailable;
		boolean isElectric;
        ArrayList<String> feautures;
        
        
		public CarDesign(String name, String color, int price, double mileage, char isAvailable, boolean isElectric,
				ArrayList<String> feautures) {
			
			this.name = name;
			this.color = color;
			this.price = price;
			this.mileage = mileage;
			this.isAvailable = isAvailable;
			this.isElectric = isElectric;
			this.feautures = feautures;
		}
		public CarDesign(String name, String color) {
			
			this.name = name;
			this.color = color;
		}
		public CarDesign(String name, String color, int price, char isAvailable) {
			
			this.name = name;
			this.color = color;
			this.price = price;
			this.isAvailable = isAvailable;
		}		

}
