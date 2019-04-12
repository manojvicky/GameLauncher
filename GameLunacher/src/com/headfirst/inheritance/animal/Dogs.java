package com.headfirst.inheritance.animal;

public class Dogs extends Animal {
Dogs(){}
Dogs(boolean isVeg, boolean isHungry){
	super(isVeg, isHungry);
}
public void speak(){
	System.out.println("Barking");
}
}
