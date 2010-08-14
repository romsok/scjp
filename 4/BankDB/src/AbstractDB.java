package com.megacorp.system;

import com.megacorp.records.Account;

abstract public class AbstractDB {
	abstract public void deposit(double amount, Account acct);
	abstract public void withdraw(double amount, Account acct);
	abstract protected double getBallance(Account acct);
	
	final void transfer(double amt, Account from, Account to) {
		withdraw(amt,from);
		deposit(amt,to);
	}
}