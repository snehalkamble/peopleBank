package com.assignment.AnimalApp.interfaces;


public interface Joke extends Base {

	public default boolean canJoke() {
		return false;
	}

	public default String joke() {
		if (canJoke()) {
			System.out.println("I make Jokes");
			return "I make Jokes";	
		}
		return blank;
	}

}
