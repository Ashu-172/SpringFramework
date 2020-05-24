package com.mishra.spring;

import javax.annotation.*;

import org.springframework.stereotype.Component;

@Component(value="shape")
public class Circle implements Shape {
	private Point center;
	
	public Point getCenter() {
		return center;
	}
	
	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle with center ("+center.getX()+", "+center.getY()+")");

	}
	
	@PostConstruct
	public void initializeCircle() {
		System.out.println("Circle Initialized..");
	}

	@PreDestroy
	public void destroyCircle() {
		System.out.println("circle Destroyed..");
	}
}
