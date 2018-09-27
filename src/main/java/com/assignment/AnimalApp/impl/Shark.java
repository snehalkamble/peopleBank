package com.assignment.AnimalApp.impl;

import com.assignment.AnimalApp.interfaces.EatFish;


public class Shark extends Fish implements EatFish {

	private String size = "Large";
	private String color = "Grey";
	
	@Override
	public boolean canEatFish() {
		return true;
	}

	@Override
	public String toString() {
		return "Sharks are " + size + 
				" and have " + color + " color";
	}
}
