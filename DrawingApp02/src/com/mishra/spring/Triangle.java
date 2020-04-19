package com.mishra.spring;

public class Triangle {
	private String type;
	//Added to use <constructor-arg> tag 
	private int height;

	
	public Triangle(String type) {
		this.type = type;
	}
	
	public Triangle(int height) {
		this.height = height;
	}
	
	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}
	
	public String getType() {
		return type;
	}

// commented for using <constructor-arg> tag to initialize.
//	public void setType(String type) {
//		this.type = type;
//	}
	
	//Added to use <constructor-arg> tah
	public int getHeight() {
		return height;
	}
	
	public void draw() {
		System.out.println(getType() + " Triangle Drawn of height "+getHeight());
	}
}
