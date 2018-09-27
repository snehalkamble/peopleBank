package com.assignment.AnimalApp;

import com.assignment.AnimalApp.impl.Bird;
import com.assignment.AnimalApp.impl.Butterfly;
import com.assignment.AnimalApp.impl.Cat;
import com.assignment.AnimalApp.impl.Caterpillar;
import com.assignment.AnimalApp.impl.Chicken;
import com.assignment.AnimalApp.impl.Clownfish;
import com.assignment.AnimalApp.impl.Dog;
import com.assignment.AnimalApp.impl.Dolphin;
import com.assignment.AnimalApp.impl.Duck;
import com.assignment.AnimalApp.impl.Fish;
import com.assignment.AnimalApp.impl.ParrotAdaptor;
import com.assignment.AnimalApp.impl.Rooster;
import com.assignment.AnimalApp.impl.Shark;
import com.assignment.AnimalApp.interfaces.Sing;

public class Solution {
	
	public static void main(String[] args) {

		//---------Solution for A-------------
		System.out.println("--------Bird--------");
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		bird.swim();
		System.out.println("--------Duck--------");
		Duck duck = new Duck();
		duck.walk();
		duck.fly();
		duck.sing();
		duck.swim();
		System.out.println("-------Chicken---------");
		Chicken chicken = new Chicken();
		chicken.walk();
		chicken.fly();
		chicken.sing();
		chicken.swim();
		System.out.println("------Rooster----------");
		Rooster rooster = new Rooster();
		rooster.walk();
		rooster.fly();
		rooster.sing();
		rooster.swim();
		System.out.println("-----Parrot with Dog-----");
		Sing parrotAdapter = new ParrotAdaptor(new Dog());
		parrotAdapter.sing();
		System.out.println("-----Parrot with Cat-----");
		parrotAdapter = new ParrotAdaptor(new Cat());
		parrotAdapter.sing();
		System.out.println("-----Parrot with Rooster-----");
		parrotAdapter = new ParrotAdaptor(new Rooster());
		parrotAdapter.sing();
		
		
		//---------Solution for B-------------
		System.out.println("--------Fish--------");
		Fish fish = new Fish();
		fish.walk();
		fish.fly();
		fish.sing();
		fish.swim();
		System.out.println("-------Shark---------");
		Shark shark = new Shark();
		shark.walk();
		shark.fly();
		shark.sing();
		shark.swim();
		shark.eatFish();
		System.out.println(shark.toString());
		System.out.println("-------Clownfish---------");
		Clownfish clownfish = new Clownfish();
		clownfish.walk();
		clownfish.fly();
		clownfish.sing();
		clownfish.swim();
		clownfish.joke();
		System.out.println(clownfish.toString());
		System.out.println("-------Dolphin---------");
		Dolphin dolphin = new Dolphin();
		dolphin.swim();
		
		
		//---------Solution for D-------------
		System.out.println("-------Butterfly---------");
		Butterfly butterfly = new Butterfly();
		butterfly.fly();
		butterfly.sing();
		System.out.println("-------Caterpillar---------");
		Caterpillar caterpillar = new Caterpillar();
		caterpillar.fly();
		caterpillar.walk();
		//Caterpillar changes to Butterfly
		Butterfly newButterfly = new Butterfly(caterpillar);
		newButterfly.fly();
		
		//---------Solution for E-------------
		System.out.println("-------Counting Animals---------");
		CountingAnimals.countAnimals();
	}

}
