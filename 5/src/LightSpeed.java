package com.romsok.scjp.ch5;

import static java.lang.System.out;

public class LightSpeed {
	public static void main(String[] args) {
		long kmFromSun = 150000000;
		long lightSpeed = 299792458;
		
		long mFromSun = kmFromSun * 1000;
		out.println("kmFromSun = " + kmFromSun);
		out.println("lightSpeed = " + lightSpeed);
		out.println("mFromSun = " + mFromSun);
		
		int seconds = (int)(mFromSun/lightSpeed);
		out.println("seconds = " + seconds);
		
		out.print("Light will use ");
		printTime(seconds);
		out.println(" to travel from the sun to the earth.");
	}
	
	public static void printTime(int sec) {
		int min = sec/60;
		sec = sec%60;
		out.println(min + " minute(s) and " + sec + " seconds(s)");
	}
}