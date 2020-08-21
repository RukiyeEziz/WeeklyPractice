package com.revature.repos;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.models.Account;
import com.revature.services.AccountService;

public class AccountDAO {
	private static final Logger log = LogManager.getLogger(AccountService.class);
	Account[] array = {new Account(6000.0, "checking"), new Account(1000.0, "saving")};
	
	public Account findInt(int id) {
		log.info("id = " + id);
		return array[id];
	}
}


