package com.assignment.AnimalApp.interfaces;

public interface Walk extends Base {

	public default boolean canWalk() {
		return false;
	}
	
	public default String walk() {
		if (canWalk()) {
			System.out.println("I am walking");
			return "I am walking";
		}
		return blank;
	}
	
}
