package com.assignment.AnimalApp.impl;


import com.assignment.AnimalApp.interfaces.Sing;

public class ParrotAdaptor implements Sing {
	Animal animal;
	
	public ParrotAdaptor(Animal animal) {
		this.animal = animal;
	}

	public String sing() {
		return animal.sing();
	}
}
