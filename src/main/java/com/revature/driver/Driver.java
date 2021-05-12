package com.revature.driver;

import com.revature.beans.*;

public class Driver {

	public static void main(String[] args) {
		Bean bean = new Bean("pinto");
		Bean bean2 = new Bean();
		CoffeeBean coffeeBean = new CoffeeBean("coffee","Sumatra", 5);
		CoffeeBean coffeeBean2 = new CoffeeBean();
		
		System.out.println(bean);
		System.out.println(bean2);
		System.out.println(coffeeBean);
		System.out.println(coffeeBean2);
		System.out.println("Matt is a Pega expert.");
	}
	
}
