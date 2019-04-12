package com.headfirst.inheritance.animal;

import com.headfirst.inheritance.food.Food;

public class Animal {
private boolean isVeg;
private boolean isHungry;

public Animal(){}

public Animal(boolean isVeg, boolean isHungary){
	this.isVeg=isVeg;
	this.isHungry=isHungary;
}

public void setIsVeg(boolean isVeg){
	this.isVeg=isVeg;
}

public boolean getIsVeg(){
	return this.isVeg;
}

public void setIsHungry(boolean isHungry){
	this.isHungry=isHungry;
}

public boolean getIsHungry(){
	return this.isHungry;
}

public void walk(){
	System.out.println("Walking");
}

public void speak(){
	System.out.println("speaking");
}

public void eat(){
	System.out.println("eating");
}

public void sleep(){
	System.out.println("sleeping");
}

public void breath(){
	System.out.println("breathing");
}

public void feed(Food f){
	if(this.isHungry){
		if(f.getIsVeg()==this.isVeg){
			isHungry=true;
			System.out.println("Food is tasty!!!. Now I am feeling better");
		}else{
			System.out.println("I am "+(this.isVeg ? "Vegetrian" : "Non-Vegetrian")+"."+"Can't eat I am still hungry..:-(");
		}
	}else{
		System.out.println("All ready Full");
	}
}

}
