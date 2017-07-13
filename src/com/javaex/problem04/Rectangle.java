package com.javaex.problem04;

public class Rectangle extends Shape implements Resizeable {
	private double width;
	private double height;
	

	public Rectangle() {}
	public Rectangle(double width, double height) {
		
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public void resize(double s) {
		width=width*s;
		height=height*s;
	}
	@Override
	public double getArea() {
		double j= width*height;
		return j;
	}
	@Override
	public double getPerimeter() {
		double i=(width+height)*2;
		return i;
	}

}
