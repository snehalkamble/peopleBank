package com.assignment.AnimalApp.impl;


public class Duck extends Bird {

	@Override
	public boolean canSwim() {
		return true;
	}
	
	@Override
	public String sing() {
		System.out.println("Quack, quack");
		return "Quack, quack";
	}


}
