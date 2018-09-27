package com.assignment.AnimalApp.impl;

import com.assignment.AnimalApp.interfaces.Fly;
import com.assignment.AnimalApp.interfaces.Walk;

public class Caterpillar extends Animal implements Fly, Walk {

	@Override
	public boolean canWalk() {
		return true;
	}
}
