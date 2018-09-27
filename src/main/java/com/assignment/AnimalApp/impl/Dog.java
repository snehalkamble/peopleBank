package com.assignment.AnimalApp.impl;


public class Dog extends Animal {

	@Override
	public boolean canSing() {
		return true;
	}
	
	@Override
	public String sing() {
		System.out.println("Woof, woof");
		return "Woof, woof";		
	}
}
