package com.headfirst.inheritance.animal;

public class Cats extends Animal {
	Cats(){}
	Cats(boolean isVeg, boolean isHungry){
		super(isVeg, isHungry);
	}
	public void speak(){
		System.out.println("Meowing");
	}
}
