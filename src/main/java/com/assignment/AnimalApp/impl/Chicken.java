package com.assignment.AnimalApp.impl;


public class Chicken extends Bird {

	@Override
	public boolean canFly() {
		return false;
	}

	@Override
	public String sing() {
		System.out.println("Cluck, cluck");
		return "Cluck, cluck";		
	}
}
