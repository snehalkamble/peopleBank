package com.assignment.AnimalApp.interfaces;

public interface Fly extends Base {

	public default boolean canFly() {
		return false;
	}

	public default String fly() {
		if (canFly()) {
			System.out.println("I am flying");
			return "I am flying";	
		}
		return blank;
	}

}
