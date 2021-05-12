package com.revature.beans;

public class CoffeeBean extends Bean {
	private String origin; 
	int roast;
	
	public CoffeeBean() {
		super();
		origin = "";
		roast = 0;
	}
	
	public CoffeeBean(String type, String origin, int roast) {
		super(type);
		this.origin = origin;
		this.roast = roast;
	}

	@Override
	public String toString() {
		return "CoffeeBean [type=" +super.getType() + ", origin=" + origin + ", roast=" + roast + "]";
	}
	
}
