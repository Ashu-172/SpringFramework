package com.mishra.spring;

public class Triangle{

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

}
