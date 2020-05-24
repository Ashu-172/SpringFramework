package com.mishra.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp03 {

	public static void main(String [] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//Triangle triangle = (Triangle)context.getBean("triangle");
		Triangle triangle = (Triangle)context.getBean("triangle-alias"); // use of alias
		triangle.draw();
	}
}
