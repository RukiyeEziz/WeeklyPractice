package com.revature.models;

public class Account {
	public double balance;
	public String type;
	
	public Account() {
		super();
	}
	public Account(double balance, String type) {
		super();
		this.balance = balance;
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", type=" + type + "]";
	}
	
	

}
