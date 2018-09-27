package com.assignment.AnimalApp.interfaces;

public interface Swim extends Base {

	public default boolean canSwim() {
		return false;
	}
	
	public default String swim() {
		if (canSwim()) {
			System.out.println("I am swimming");
			return "I am swimming";
		}
		return blank;
	}
	
}
