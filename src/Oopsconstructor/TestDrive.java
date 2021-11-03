package Oopsconstructor;

import java.util.ArrayList;

public class TestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarDesign cd= new CarDesign("alto","blue");
		System.out.println(cd.name + " "+ cd.color );
		System.out.println("==============================");
		CarDesign cd1= new CarDesign("verna","green",12444,'Y');
		System.out.println(cd1.name+" "+ cd1.color+ " "+ cd1.price+ " "+ cd1.isAvailable );
		System.out.println("==============================");
		// passing arraylist as parameter
		ArrayList<String>carfe=new ArrayList<String>();
		carfe.add("automation parking");
		carfe.add("sunroof");
		carfe.add("rear camera");
		
		CarDesign cd2= new CarDesign("verna","green",12444,15.78,'Y',true,carfe);
		System.out.println(cd2.name+" "+ cd2.color+ " "+ cd2.price+ " "+ cd2.isAvailable + cd2.isElectric );
		System.out.println(cd2.feautures);
	
		System.out.println("==============================");
	}

}
