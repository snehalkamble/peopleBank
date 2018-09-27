package com.assignment.AnimalApp.impl;

import com.assignment.AnimalApp.interfaces.Swim;

public class Dolphin extends Animal implements Swim {

	@Override
	public boolean canSwim() {
		return true;
	}
	
	@Override
	public boolean canWalk() {
		return false;
	}
}
