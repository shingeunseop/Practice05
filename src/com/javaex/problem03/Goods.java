package com.javaex.problem03;

public class Goods {

	private String name;
	private int price;
	private int count;
	
	public Goods() {}

	public Goods(String name, int price, int count) {
	 
		this.price = price;
		this.count = count;
		   this.name = name;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
