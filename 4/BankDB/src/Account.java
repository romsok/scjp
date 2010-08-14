package com.megacorp.records;

public class Account {
	private double ballance;
	
	public double getBallance() {
		return ballance;
	}
	
	public void setBallance(double newBallance) {
		this.ballance = newBallance;
	}
	
	public Account(double initBallance) {
		this.ballance = initBallance;
	}
}