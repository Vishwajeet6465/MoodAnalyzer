package com.method.java;

import static org.junit.Assert.*;
import org.junit.Test;

public class MoodTest {

	@Test
	public void testSadMood() {
		Analyzer anlzr = new Analyzer("I am in a sad Mood.");
		String result = anlzr.Mood();
		assertEquals("Sad", result);
	}
	
	@Test
	public void testHappyMood() {
		Analyzer anlzr = new Analyzer("I am Happy.");
		String result = anlzr.Mood();
		assertEquals("Happy", result);
	}
	
	@Test
	public void testNullMood() {
		try {
		Analyzer anlzr = new Analyzer("");
		String result = anlzr.Mood();
		assertEquals("", result);
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
