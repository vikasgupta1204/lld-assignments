package DesignPatterns.PrototypeDesignPattern.VechileExample;

public class Car extends Vechile {

	public Car() {}
	public Car(Car c) {
		super(c);
	}
	
	@Override
	public Vechile clone() {
		return new Car(this);
	}

}
