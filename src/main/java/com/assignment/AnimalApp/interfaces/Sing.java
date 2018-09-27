package com.assignment.AnimalApp.interfaces;

public interface Sing extends Base {


	public default boolean canSing() {
		return false;
	}

	public default String sing() {
		if (canSing()) {
			System.out.println("I am singing");
			return "I am singing";
		}
		return blank;
	}

}
