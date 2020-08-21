package Aug_04.CarModels;

public class SportsCar extends Car {
	public SportsCar() {
		
		//ectended Car so I could call 4-arg constructor
		super(4, 2, "Jaguar", "red");
		
		
	} 
	public SportsCar(int tires, int doors, String model, String color) {
		super(tires, doors, model, color);
	}
	
	public void drive() {
		System.out.println("Woooooh I can drive fast");
	}
	
	public static void honk() {
		System.out.println("Naaay sportscar");
	}
	

}
