package Aug_05;

import java.util.Scanner;

public class HelloScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Your Name: ");
		String name = keyboard.nextLine();
		System.out.println("Hello " + name + ", what's up?");
		System.out.println("Your Age: ");
		int age = keyboard.nextInt();
		System.out.println(age + ", woo you look tougher thann that ;)");
		
		
		
		keyboard.close();
	}

}
