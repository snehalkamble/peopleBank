package com.assignment.AnimalApp.Helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.assignment.AnimalApp.impl.Animal;
import com.assignment.AnimalApp.impl.AnimalFactory;

@Component
public class AnimalHelper {

	public List<String> getAnimalBehavior(String type) throws Exception {
		
		Animal animal = AnimalFactory.getAnimal(type);
		List<String> result = new ArrayList<>();
		
		if (null != animal) {
			if (animal.canFly())
				result.add(animal.fly());
			if (animal.canWalk())
				result.add(animal.walk());
			if (animal.canSing())
				result.add(animal.sing());
			if (animal.canSwim())
				result.add(animal.swim());
		} else 
			throw new Exception("Animal not found");
		
		return result;
	}
}
