package com.mishra.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp14 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Shape shape = (Shape)context.getBean("shape");
		shape.draw();
		System.out.println(context.getMessage("greeting", null, "Default Greeting", null));
	}

}
