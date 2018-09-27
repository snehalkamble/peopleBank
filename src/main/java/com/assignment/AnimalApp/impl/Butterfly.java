package com.assignment.AnimalApp.impl;

import com.assignment.AnimalApp.interfaces.Fly;
import com.assignment.AnimalApp.interfaces.Sing;

public class Butterfly extends Animal implements Fly, Sing {
	
	@Override
	public boolean canFly() {
		return true;
	}
	
	@Override
	public boolean canWalk() {
		return false;
	}
	
	public Butterfly() {};
	
	public Butterfly(Caterpillar c) {
	}
}
