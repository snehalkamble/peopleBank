package com.assignment.AnimalApp.impl;


import com.assignment.AnimalApp.interfaces.Fly;
import com.assignment.AnimalApp.interfaces.Sing;
import com.assignment.AnimalApp.interfaces.Swim;
import com.assignment.AnimalApp.interfaces.Walk;

public class Animal implements Walk, Fly, Sing, Swim {

	@Override
	public boolean canWalk() {
		return true;
	}

}
