package Aug_05;

import Aug_05.models.SportsCar;

public class Driver {

	static SportsCar myCar = new SportsCar(2, "black", "RX-8, R3", 3 , true);
	public static void main(String[] args) {

		myCar.move(200);
		
		boolean con = true;
		System.out.println("--------------");
		
		
		while(myCar.getHasTurbo() && con) {
			System.out.println("In first while loop");
			if (con) {
				System.out.println("in if statement");
				con = false;
				continue;
			}
			System.out.println("I am at the end of my while loop");
		}
		System.out.println("--------------");
		
		// 
		while(con & myCar.getHasTurbo()) {
			System.out.println("In second while loop");
			if (con) {
				System.out.println("in if statement");
				con = false;
				continue;
			}
			System.out.println("I am at the end of my while loop");
		}
		System.out.println("--------------");
		
		
		// it doesnt show nothing
		
		while(con && myCar.getHasTurbo()) {
			System.out.println("In third while loop");
			if (con) {
				System.out.println("in if statement");
				con = false;
				continue;
			}
			System.out.println("I am at the end of my while loop");
			
		}
		System.out.println("--------------");
		
		do {
			System.out.println("I will do this once");
			myCar.hasTurbo = !myCar.hasTurbo;
			
		
		}while(myCar.getHasTurbo());
		System.out.println("--------------");
		
		for(int i = 0; i <= myCar.seats; i++) {
			System.out.println("you have filled " + i + " seats in your car");
		}
		System.out.println("--------------");
		
		switch(myCar.color) {
			case "White": System.out.println("White - my car");break;
			case "black": System.out.println("black - mycar");break;
			case "Purple": System.out.println("Purple - mycar");break;
			default: System.out.println("what color?");break;
		}
		
		System.out.println("--------------");
		
		switch(myCar.color) {
		case "White": System.out.println("White - my car");break;
		case "black": System.out.println("black - mycar");
		case "Purple": System.out.println("Purple - mycar");break;
		default: System.out.println("what color?");break;
		}
	
		System.out.println("--------------");
	
	

	}

}
