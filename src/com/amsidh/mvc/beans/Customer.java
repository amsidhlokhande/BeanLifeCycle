package com.amsidh.mvc.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Customer
		implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

	private Integer customerId;

	private ApplicationContext applicationContext;

	private BeanFactory beanFactory;

	public Customer() {
		System.out.println("Default constructor is called");
	}

	public Customer(Integer customerId) {
		System.out.println("Paramaterized constructor of Customer is called");
		this.customerId = customerId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		System.out.println("setCustomerId is called");
		this.customerId = customerId;
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("setBeanName is called " + beanName);

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory is called");
		this.beanFactory = beanFactory;

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext is called");
		this.applicationContext = applicationContext;

	}

	public ApplicationContext getContext() {
		return applicationContext;
	}

	// here a centralized postProcessBeforeInitialization be called if ApplicationContext has BeanPostProcessor
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet is called");

	}

	// user defined init method
	public void init() {
		System.out.println("This is user defined init method");
	}

	// here a centralized postProcessAfterInitialization is called if ApplicationContext has BeanPostProcessor
	
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method is called.");
	}

	// user defined destroymethod
	public void exit() {
		System.out.println("User defined destroyed method is called");
	}

}
