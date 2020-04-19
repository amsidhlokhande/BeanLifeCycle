package com.amsidh.mvc.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	private ConfigurableListableBeanFactory configurableListableBeanFactory;

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory)
			throws BeansException {
		System.out.println(
				"postProcessBeanFactory is called. And total no of beans are " + configurableListableBeanFactory.getBeanDefinitionCount());
		this.configurableListableBeanFactory = configurableListableBeanFactory;
	}

	public ConfigurableListableBeanFactory getConfigurableListableBeanFactory() {
		return configurableListableBeanFactory;
	}

}
