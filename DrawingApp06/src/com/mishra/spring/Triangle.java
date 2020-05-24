package com.mishra.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,BeanNameAware{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private String beanName = null;
	private ApplicationContext context = null;
		
	public void draw() {
		pointA = (Point)context.getBean("point1");
		pointB = (Point)context.getBean("point2");
		pointC = (Point)context.getBean("point3");

		System.out.println(beanName + " Drawn with points "
				+ "A("+pointA.getX()+","+pointA.getY()+"), "
						+ "B("+pointB.getX()+","+pointB.getY()+") and "
								+ "C("+pointC.getX()+","+pointC.getY()+")");
	}


	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
		
	}


	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}
}
