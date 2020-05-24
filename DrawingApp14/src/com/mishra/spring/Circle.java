package com.mishra.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class Circle implements Shape {
	private Point center;
	private MessageSource messageSource;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}
	@Autowired
	public void setMessageSource(MessageSource messageSoutce) {
		this.messageSource = messageSoutce;
	}

	public Point getCenter() {
		return center;
	}
	
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@Override
	public void draw() {
		/* Part 1
		System.out.println("Drawing Circle with center ("+center.getX()+", "+center.getY()+")");
		System.out.println(messageSource.getMessage("greeting2",null,"Default greeting", null));
		*/
		/* part 2*/
		System.out.println(messageSource.getMessage("drawing.circle",null,"Default circle message", null));
		System.out.println(messageSource.getMessage("drawing.point",new Object[] {center.getX(),center.getY()},"Default point message", null));
	}

}
