package com.mishra.spring;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class DislayNameBeanPostProcessor implements BeanPostProcessor{
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) {
		System.out.println("PostProcessor called  after Initialization of bean "+beanName);
		return bean;
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) {
		System.out.println("PostProcessor called  before Initialization of bean "+beanName);
		return bean;
	}
}
