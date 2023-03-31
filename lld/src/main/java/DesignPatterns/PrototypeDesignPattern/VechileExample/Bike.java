package DesignPatterns.PrototypeDesignPattern.VechileExample;

public class Bike extends Vechile {

	public Bike() {}
	public Bike(Bike b) {
		super(b);		
	}
	@Override
	public Vechile clone() {
		return new Bike(this);
	}

}
