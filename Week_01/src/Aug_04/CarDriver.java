package Aug_04;

import Aug_04.CarModels.Car;
import Aug_04.CarModels.SportsCar;
import Aug_04.CarModels.Mustang;

public class CarDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car();
		System.out.println("door = " + car1.doors);
		System.out.println("tires = " + car1.tires);
		System.out.println("model = " + car1.model);
		System.out.println("color = " + car1.color);
		
		System.out.println("-------------");
		
		Car car2 = new Car(5, 7, "model x", "black");
		System.out.println("door2 = " + car2.doors);
		System.out.println("tires2 = " + car2.tires);
		System.out.println("model2 = " + car2.model);
		System.out.println("color2 = " + car2.color);
		
		System.out.println("-------------");
		SportsCar s = new SportsCar(); 
		
		s.drive();
		System.out.println(s.color);
		
		SportsCar s2 = new SportsCar(6, 9, "RX-8", "Hot Pink");
		System.out.println(s2.color);
		
		System.out.println("-------------");
		Mustang m = new Mustang(2, "gt", "yellow");
		
		//this shows overriding
		s.drive();
		m.drive();
		
		//static methods can be called directly from the class
		SportsCar.honk();
		Mustang.honk();
		System.out.println("-------------");
		
		// example of upcasting
		SportsCar sc = new Mustang(4, "gt", "Green");
		sc.drive();
		m.showOff();
		
		// I can not do this because the method does not exist 
		// in the declared type: SPortsCar
		//sc.showOff();
		System.out.println("-------------");
		
		// this is downcsting
		Mustang mu = (Mustang)sc;
		mu.showOff();
		System.out.println("-------------");
		
		//this will not work at runtime because sc is not actually
		// a mustang. it will however compile
		// ClassCastException
		//sc = new SportsCar(4, 5 , "test", "test");
		//mu = (Mustang)sc;
		
		int i = 0; 
		while( i != 4) {
			switch(i) {
			case 0: System.out.println(0);
			break;
			case 1: System.out.println(1);
			default: System.out.println("x");
			break;
			}
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
