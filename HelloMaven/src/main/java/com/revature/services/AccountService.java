package com.revature.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.models.Account;
import com.revature.repos.AccountDAO;

public class AccountService {
	private static final Logger log = LogManager.getLogger(AccountService.class);
	private AccountDAO dao = new AccountDAO();
	
	public Account findAccountById(int id) {
		log.info("account id = " + id);
		return dao.findInt(id);
	}
	
	
}
