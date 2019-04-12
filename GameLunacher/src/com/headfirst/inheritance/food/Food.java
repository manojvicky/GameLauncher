package com.headfirst.inheritance.food;

public class Food {
	private boolean isVeg;
	public Food(){}
	
	public Food(boolean isVeg){
		this.isVeg=isVeg;
	}
	public boolean getIsVeg(){
		return this.isVeg;
	}
	public void setIsVeg(boolean isVeg){
		this.isVeg=isVeg;
	}
}
