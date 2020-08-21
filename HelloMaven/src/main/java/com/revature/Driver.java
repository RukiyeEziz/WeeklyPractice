package com.revature;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.models.Account;
import com.revature.services.AccountService;

public class Driver {
	
	private static final Logger log = LogManager.getLogger(Driver.class);
	private static AccountService as = new AccountService();
	
	
	public static void main(String[] args) {
		
		log.info("=== The application has started ===");
		
		
		Account a = as.findAccountById(1);
		System.out.println(a);
		log.info(a);
		
		log.atLevel(Level.INFO);
		 
	    log.trace("Trace Message!");
	    log.debug("Debug Message!");
	    log.info("Info Message!");
	    log.warn("Warn Message!");
	    log.error("Error Message!");
	    log.fatal("Fatal Message!");

		try {
			recur();
		}catch(Error e) {
			log.error("Error hapened yo!!!");
			
		}
		log.info("=== The application ends ===");
	}
	
	public static void recur() {
		recur(); // stackouver flow happen bkz of recur() call recur() method over again over
	}

}
