package Aug_06.HelloThreads;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		
		// Priority tells Java which threads should be run before
		// others it they are competing for resources
		// default priority is 5
		emp1.setPriority(1);
		emp1.start();
		
		Employee emp2 = new Employee();
		emp2.setPriority(2);
		emp2.start();
		
		/*
		 * join() method
		 * 
		 * Using join(), we tell our thread to wait until the specified thread completes
		 * its execution. There are overloaded versions of the join() method, which
		 * allows us to specify the time for which you want to wait for the specified
		 * thread to terminate.
		 */
		try {
			emp1.join(); // Waiting for emp1 to finish its execution
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Display the priority of threads. Threads with higher numbers will be granted higher priority. 
		//The default priority is 5. The number range is 1-10
		System.out.println(emp1.getPriority());
		System.out.println(emp2.getPriority());

		// Check to see if a given thread is alive or dead
		System.out.println(emp1.isAlive());
		System.out.println(emp2.isAlive());
		

	}

}
