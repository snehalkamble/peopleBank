package com.assignment.AnimalApp.impl;


public class Cat extends Animal {

	@Override
	public boolean canSing() {
		return true;
	}
	
	@Override
	public String sing() {
		System.out.println("Meow");
		return "Meow";		
	}
}
