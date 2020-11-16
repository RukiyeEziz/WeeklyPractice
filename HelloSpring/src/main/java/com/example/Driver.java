package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.models.User;

public class Driver {
	public static void main(String[] args) {
			
			// singleton scoped
			//created application context container
			ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
			
			//asked the container for a user object
			//on getBean("user") of "user" came from applicationContext.xml 
			//<bean name="user" class="com.example.models.User">..
	//		User u = (User) ac.getBean("user");	
	//		System.out.println("User u before set: " + u);		
	//		u.setId(1);
	//		u.setName("Ruki");
	//		u.getAcc().setAmount(9911.12);		
	//		System.out.println("User u after set " + u);
	//		
	//		User u2 = (User) ac.getBean("user");
	//		System.out.println("User u2 before set: " + u2);		
	//		u.setId(2);
	//		u.setName("GattieTime");
	//		u.getAcc().setAmount(1234.56);		
	//		System.out.println("User u after set " + u2);
	//		// watch this, this is produce same bean object with 
	//		//singlton scope happining here
	//		System.out.println("User u after u2 " + u);
			
			//User u before set: User [id=0, name=null, acc=Account [amount=0.0]]
	//		User u after set User [id=1, name=Ruki, acc=Account [amount=9911.12]]
	//		User u2 before set: User [id=1, name=Ruki, acc=Account [amount=9911.12]]
	//		User u after set User [id=2, name=GattieTime, acc=Account [amount=1234.56]]
	//		User u after u2 User [id=2, name=GattieTime, acc=Account [amount=1234.56]]
			
			
			// Prototype Scoped -----------
			//created application context container
			//ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
			
			User u3 = (User) ac.getBean("user");	
			System.out.println("User u3 before set: " + u3);		
			u3.setId(1);
			u3.setName("Ruki");
			u3.getAcc().setAmount(9911.12);		
			System.out.println("User u3 after set " + u3);
			
			User u4 = (User) ac.getBean("user");
			System.out.println("User u4 before set: " + u4);		
			u4.setId(2);
			u4.setName("GattieTime");
			u4.getAcc().setAmount(1234.56);		
			System.out.println("User u4 after set " + u4);
			// watch this, this is produce same bean object with 
			//singlton scope happining here
			System.out.println("User u3 after u4 " + u3);
			
	//		User u3 before set: User [id=0, name=null, acc=Account [amount=0.0]]
	//		User u3 after set User [id=1, name=Ruki, acc=Account [amount=9911.12]]
	//		User u4 before set: User [id=1, name=Ruki, acc=Account [amount=9911.12]]
	//		User u4 after set User [id=2, name=GattieTime, acc=Account [amount=1234.56]]
	//		User u3 after u4 User [id=2, name=GattieTime, acc=Account [amount=1234.56]]
	
			
			
			
			
			
			
			
	}
		

			
			
}
