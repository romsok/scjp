package com.ramy.scjp;

import java.util.Properties;
import static java.lang.System.out;
import java.util.Set;

public class SysProp {
	
	public static void main(String[] args) {
		Properties props = System.getProperties();
		
		
		for(Object prop : props.keySet()){
			String value = props.getProperty((String)prop);
			out.printf("%s=%s%n",prop,value);
		}
	}
}