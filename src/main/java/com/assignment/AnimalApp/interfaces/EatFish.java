package com.assignment.AnimalApp.interfaces;


public interface EatFish extends Base {

	public default boolean canEatFish() {
		return false;
	}

	public default String eatFish() {
		if (canEatFish()) {
			System.out.println("I Eat Fish");
			return "I Eat Fish";	
		}
		return blank;
	}

}
