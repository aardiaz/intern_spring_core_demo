package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext  context = new ClassPathXmlApplicationContext("beans.xml");
		
		  Product p = (Product) context.getBean("prod");
		  System.out.println(p);
		  
		  Customer  ct = context.getBean("cust",Customer.class);
		  System.out.println(ct);
	}

}
