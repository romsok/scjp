package com.megacorp.system;

import com.megacorp.records.Account;

public class SimpleDB extends AbstractDB {
	public void deposit(double amount, Account acct) {
		acct.setBallance(acct.getBallance() + amount);
	}
	
	public void withdraw(double amount, Account acct) {
		acct.setBallance(acct.getBallance() - amount);
	}
	
	protected double getBallance(Account acct) {
		return acct.getBallance();
	}
}