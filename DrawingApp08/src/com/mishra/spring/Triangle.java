package com.mishra.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
		public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Triangle Drawn with points "
				+ "A("+pointA.getX()+","+pointA.getY()+"), "
						+ "B("+pointB.getX()+","+pointB.getY()+") and "
								+ "C("+pointC.getX()+","+pointC.getY()+")");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean Destroying Bean..!");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean is initialized by InitializingBean..");
		
	}
	
	public void myInit() {
		System.out.println("MyInit called..");
	}
	
	public void myDestroy() {
		System.out.println("myDestroy called..");
	}

	public void myDefaultInit() {
		System.out.println("MyDefaultInit called..");
	}
	
	public void myDefaultDestroy() {
		System.out.println("myDefaultDestroy called..");
	}

}
