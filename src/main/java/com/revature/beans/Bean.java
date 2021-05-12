package com.revature.beans;

public class Bean {

	String type;
	
	public Bean() {
		type = "bean";
	}
	
	public Bean(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Bean [type=" + type + "]";
	}
	
}
