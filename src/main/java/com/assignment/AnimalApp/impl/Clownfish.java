package com.assignment.AnimalApp.impl;

import com.assignment.AnimalApp.interfaces.Joke;


public class Clownfish extends Fish implements Joke {

	private String size = "Small";
	private String color = "Orange";
	
	@Override
	public boolean canJoke() {
		return true;
	}

	@Override
	public String toString() {
		return "Clownfish are " + size + 
				" and have " + color + " color";
	}
}
