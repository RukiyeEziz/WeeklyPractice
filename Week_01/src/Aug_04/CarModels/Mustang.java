package Aug_04.CarModels;

public class Mustang extends SportsCar{
	public Mustang(int doors, String model, String color) {
		super(4, doors, model, color);
	}
	
	//overriding the SpotCar drive()
	public void drive() {
		System.out.println("naaay ... mustang");
	}
	
	//
	public static void honk() {
		System.out.println("Honk Honk mustang");
	}
	public void showOff() {
		System.out.println("im eating donut");
		
	}

}
