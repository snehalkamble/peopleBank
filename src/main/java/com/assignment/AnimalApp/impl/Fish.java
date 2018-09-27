package com.assignment.AnimalApp.impl;


public class Fish extends Animal {

	@Override
	public boolean canSing() {
		return false;
	}
	@Override
	public boolean canWalk() {
		return false;
	}
	@Override
	public boolean canSwim() {
		return true;
	}
}
