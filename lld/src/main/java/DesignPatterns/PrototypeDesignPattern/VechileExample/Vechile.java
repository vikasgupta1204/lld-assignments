package DesignPatterns.PrototypeDesignPattern.VechileExample;

public abstract class Vechile {
protected int seats;
protected int tyres;
protected String color;
protected String fuel;
public Vechile() {}
public Vechile(Vechile v) {
	this.seats=v.seats;
	this.tyres=v.tyres;
	this.color=v.color;
	this.fuel=v.fuel;
}

public abstract Vechile clone();
@Override
public String toString() {
	return "Vechile [seats=" + seats + ", tyres=" + tyres + ", color=" + color + ", fuel=" + fuel + "]";
}

}
