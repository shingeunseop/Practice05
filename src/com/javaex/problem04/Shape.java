package com.javaex.problem04;

public abstract class Shape {
	private int cointSides;
	

	public Shape() {}
	public Shape(int countSides) {

	}
	
	abstract public double getArea();
	abstract public double gePerimeter();
	

	public int getCointSides() {
		return cointSides;
	}

	public void setCointSides(int cointSides) {
		this.cointSides = cointSides;
	}

}
