package com.mishra.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp08 {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();

	}

}
