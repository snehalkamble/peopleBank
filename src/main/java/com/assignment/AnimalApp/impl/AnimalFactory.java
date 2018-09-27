package com.assignment.AnimalApp.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;


public class AnimalFactory {
	
	public static Map<String, Supplier<Animal>> factory = new HashMap<>();
	
	static {
		factory.put("BIRD", Bird::new);
		factory.put("DUCK", Duck::new);
		factory.put("CHICKEN", Chicken::new);
		factory.put("ROOSTER",	Rooster::new);
		factory.put("PARROT", Parrot::new);
		factory.put("FISH", Fish::new);
		factory.put("SHARK", Shark::new);
		factory.put("CLOWNFISH", Clownfish::new);
		factory.put("DOLPHIN", Dolphin::new);
		factory.put("DOG", Dog::new);
		factory.put("BUTTERFLY", Butterfly::new);
		factory.put("CAT", Cat::new);
	}
	
	public static Animal getAnimal(String type) {
		return factory.get(type.toUpperCase()).get();
	}
}
