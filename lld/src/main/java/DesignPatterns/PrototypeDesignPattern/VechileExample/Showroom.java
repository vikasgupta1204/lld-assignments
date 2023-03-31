package DesignPatterns.PrototypeDesignPattern.VechileExample;

import java.util.ArrayList;
import java.util.List;

public class Showroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Vechile> vehicles=new ArrayList<>();
		List<Vechile> vehiclesCopy=new ArrayList<>();
		
		Bike b1=new Bike();
		b1.seats=1;
		b1.tyres=2;
		b1.color="Black";
		b1.fuel="Petrol";
		vehicles.add(b1);
		
		Car c1=new Car();
		c1.seats=5;
		c1.tyres=4;
		c1.color="White";
		c1.fuel=	"Electric";
		vehicles.add(c1);
		
		for(Vechile vehicle:vehicles) {
			vehiclesCopy.add(vehicle.clone());
	}
	
		
		System.out.println("Original Objects:-\n");
		for(Vechile vehicle:vehicles) {
				System.out.println(vehicle);

		}
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("Prototyped Object:-\n");
		for(Vechile vechile:vehiclesCopy) {
			System.out.println(vechile);
		}
		
	}

}
