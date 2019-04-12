package com.headfirst.inheritance.animal;

import com.headfirst.inheritance.food.Chicken;
import com.headfirst.inheritance.food.Food;

public class AnimalTest {

	public static void main(String[] args) {
		Dogs d = new Dogs(true, false);
		Cats c = new Cats(false, true);
		Hippo h = new Hippo(true, false);
		Food roti = new Food(true);
		Food bread = new Food(true);
		Food chicken = new Chicken(false);
		Food mutton = new Food(false);
		d.feed(roti);
		d.speak();
		d.setIsHungry(true);
		d.feed(chicken);
		c.speak();
		c.feed(bread);
		c.setIsHungry(true);
		c.feed(mutton);
		h.setIsHungry(true);
		h.feed(chicken);
		h.feed(bread);
	}

}
