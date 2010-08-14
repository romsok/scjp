package com.megacorp.system;

import com.megacorp.records.Account;
import static java.lang.System.out;

public class InsideTest {
	public static void main(String[] args) {
		Account acct1 = new Account(200.50);
		Account acct2 = new Account(150.83);
		
		SimpleDB sd = new SimpleDB();
		
		out.println("acct1 init: " + sd.getBallance(acct1));
		sd.withdraw(10.40,acct1);
		out.println("acct1 after withdrawing 10.40: " + sd.getBallance(acct1));
		
		out.println("acct2 init: " + sd.getBallance(acct2));
		acct2.deposit(50.43,acct2);
		out.println("acct2 after depositing 50.43: " + sd.getBallance(acct2));
		
		out.println("acct1 before transfering 23.75 to acct2: " + sd.getBallance(acct1));
		out.println("acct2 before receiving 23.75 from acct1: " + sd.getBallance(acct2));
		
		sd.transfer(23.75,acct1,acct2);
		
		out.println("acct1 after transfering 23.75 to acct2: " + sd.getBallance(acct1));
		out.println("acct2 after receiving 23.75 from acct1: " + sd.getBallance(acct2));
	}
}