package com.mishra.spring;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.FileSystemResource;

public class SpringDrawingApp01 {

	public static void main(String[] args) {
		//Without Spring
		//Triangle triangle = new Triangle();
		
		
		//Using Spring Bean Factory(Depricated)
		//BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Triangle triangle = (Triangle)beanFactory.getBean("triangle");
		
		
		//Using Application Context [file spring.xml needs to be moved to src folder(classpath)] 
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();

	}

}
