package com.assignment.AnimalApp;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.assignment.AnimalApp.impl.Animal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnimalTest {

	Animal animal = new Animal();

	@Test
	public void testIfAnimalCanWalk() {
		Assert.assertEquals(true, animal.canWalk());
		Assert.assertEquals("I am walking", animal.walk());
	}
	@Test
	public void testIfAnimalCannotFly() {
		Assert.assertEquals(false, animal.canFly());
		Assert.assertEquals("", animal.fly());
	}
	@Test
	public void testIfAnimalCannotSing() {
		Assert.assertEquals(false, animal.canSing());
		Assert.assertEquals("", animal.sing());
	}
	@Test
	public void testIfAnimalCannotSwim() {
		Assert.assertEquals(false, animal.canSwim());
		Assert.assertEquals("", animal.swim());
	}
}
