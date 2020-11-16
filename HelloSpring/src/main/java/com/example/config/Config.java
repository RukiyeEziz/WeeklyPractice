package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.models.Account;
import com.example.models.User;

@Configuration
public class Config {
	// xml configuration way1   applicationContext.xml
	
		// configuration class style way2  @Configuration
		
		//asked the container for a user object
		//on (name="user") of "user" came from applicationContext.xml 
		//<bean name="user" class="com.revature.models.User">..
		@Bean(name="user")
		public User getUser() {
			return new User(getAccount());
		}
	//	
		@Bean(name="account")
		public Account getAccount() {
			return new Account();
		}
}
