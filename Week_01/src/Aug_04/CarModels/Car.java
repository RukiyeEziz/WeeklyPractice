package Aug_04.CarModels;

// in this java class explain how constructor work

public class Car {
	
	public int tires;
	public int doors;
	public String model;
	public String color;
	
	// this is a no-args constructor
	// has the name of class
	// has no return type
	public Car() {
		super();
		
		System.out.println("In the no-arg constructor");
		tires = 4;
		doors = 4;
		model = "Lumina";
		color = "white";
		
	}
	
	public Car(int tires, int doors) {
		//super();
		System.out.println("In the 2-arg constructor");
		this.tires = tires;
		this.doors = doors;
		
	}
	
	public Car(int tires, int doors, String model, String color) {
		super();
		//this(tires,doors);
		System.out.println("In the 4-arg constructor");
		this.tires = tires;
		this.doors = doors;
		this.model = model;
		this.color = color;
		
	}
	
}
