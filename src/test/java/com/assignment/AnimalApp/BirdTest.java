package com.assignment.AnimalApp;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.assignment.AnimalApp.impl.Bird;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BirdTest {

	Bird bird = new Bird();
			
	@Test
	public void testIfBirdCanWalk() {
		Assert.assertEquals(true, bird.canWalk());
		Assert.assertEquals("I am walking", bird.walk());
	}
	@Test
	public void testIfBirdCanFly() {
		Assert.assertEquals(true, bird.canFly());
		Assert.assertEquals("I am flying", bird.fly());
	}
	@Test
	public void testIfBirdCanSing() {
		Assert.assertEquals(true, bird.canSing());
		Assert.assertEquals("I am singing", bird.sing());
	}
	@Test
	public void testIfBirdCannotSwim() {
		Assert.assertEquals(false, bird.canSwim());
		Assert.assertEquals("", bird.swim());
	}	
}
