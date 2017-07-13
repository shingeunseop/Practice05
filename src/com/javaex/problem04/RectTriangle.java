package com.javaex.problem04;

public class RectTriangle extends Shape{
	private double width;
	private double height;
	
	
	
	
	
	public RectTriangle() {}
	public RectTriangle(int width, int height) {
		
		this.width = width;
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public double getArea() {
		double j=(width*height)/2;
		return j;
	}
	@Override
	public double getPerimeter() {
		double i=width+height+Math.sqrt(width*width+height*height);
		return i;
	}
	
	

}
