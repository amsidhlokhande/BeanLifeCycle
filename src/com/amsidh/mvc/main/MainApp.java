package com.amsidh.mvc.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amsidh.mvc.beans.Customer;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		Customer customer=(Customer)context.getBean("com.amsidh.mvc.beans.Customer#0");
		context.registerShutdownHook();
		context.close();
	}

}
