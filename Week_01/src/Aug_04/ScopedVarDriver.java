package Aug_04;
// This class is demo-ing about variable scopes
/*
 * multi-line comment
 * 
 * ctrl / --> comment , uncomment
 */

public class ScopedVarDriver {
	// this is a class scoped variable, initialized
		static int n1 = 5;
		// this is a class scoped variable, uninitialized
		static int n2;
		// this is a reference variable in the class scope
		static ScopedVarDriver D;
		// this is an object scoped variable. Every instance 
		// of the Driver class will have its own copy of this 
		// variable, it can work independently
		double d1 = 3.1444;
		
		
		
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("n1 = " + n1); // 5
			System.out.println("n2 = " + n2); // 0
			System.out.println("D = " + D); // null
			
			// this does not work, because due to object object
			// specific and we are in static method
			//// System.out.println(d1); //error
			
			// in order to object scoped variable, we need to create
			// new Driver() object
			D = new ScopedVarDriver();
			System.out.println("D.d1 = " +  D.d1); //3.1444
			
			// because n2 is class scoped so I can access it in the 
			// static method and change it
			n2 = 45;
			System.out.println("changed n2 = " + n2);
			
			// Because d is a Driver object, it also has access to n2
			// and I can access it with a dot operator
			//
			D.n2 = 400; 
			System.out.println("changed D.n2 = " + D.n2); // 
			
			// this is a method scope variable
			int n3 = 55;
			System.out.println("n3 = " + n3); // 55
			
			// calling static test method
			ScopedVarDriver.test();
			
			// calling void test2 method
			D.test2();

		}
		//a test method
		public static void test() {
			System.out.println("In the test method");
			
			// I can not access the n3 variable, because it is scoped to
			// the main method
			
			if(true) {
				// it is a block scoped variable
				int n4 = 4;
				System.out.println(n4); // 4
			}
			
			// I can not access to n4 in here because it is a 
			// blocked scoped variable
			//System.out.println(n4); // error
			
			
		}
		
		public void test2() {
			System.out.println("In the test2 method");
		}
		


}
