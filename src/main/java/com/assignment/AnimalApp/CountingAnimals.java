package com.assignment.AnimalApp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.assignment.AnimalApp.impl.Animal;
import com.assignment.AnimalApp.impl.AnimalFactory;


public class CountingAnimals {

	public static void countAnimals() {
		
		String[] animalArray = new String[]{
			"Bird",
			"Duck",
			"Chicken",
			"Rooster",
			"Parrot",
			"Fish",
			"Shark",
			"Clownfish",
			"Dolphin",
			"Dog",
			"Butterfly",
			"Cat"};
		
		List<Animal> animalList = Stream.of(animalArray).map(
				m -> AnimalFactory.getAnimal(m)).collect(Collectors.toList());
		
		Map<String, Integer> counterMap = new HashMap<>();
		
		animalList.stream().forEach(each -> {
			if (each.canWalk()) {
				if (counterMap.containsKey("walk"))
					counterMap.put("walk", counterMap.get("walk") + 1);
				else
					counterMap.put("walk", 1);
			} 
			if (each.canFly()) {
				if (counterMap.containsKey("fly"))
					counterMap.put("fly", counterMap.get("fly") + 1);
				else
					counterMap.put("fly", 1);
			} 
			if (each.canSing()) {
				if (counterMap.containsKey("sing"))
					counterMap.put("sing", counterMap.get("sing") + 1);
				else
					counterMap.put("sing", 1);
			}
			if (each.canSwim()) {
				if (counterMap.containsKey("swim"))
					counterMap.put("swim", counterMap.get("swim") + 1);
				else
					counterMap.put("swim", 1);
			}
		});
		
		System.out.println("No. of animals who can FLY is - " + counterMap.get("fly"));
		System.out.println("No. of animals who can WALK is - " + counterMap.get("walk"));
		System.out.println("No. of animals who can SING is - " + counterMap.get("sing"));
		System.out.println("No. of animals who can SWIM is - " + counterMap.get("swim"));
	}
	
	public static void main(String[] args) {
		countAnimals();
	}
}
