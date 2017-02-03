package com.kata.FizzBuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestKataFizzBuzz {

	@Test
	public void outputIsNumber() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		assertEquals("1", fizzbuzz.whatToSay(1));
		assertEquals("2", fizzbuzz.whatToSay(2));
		assertEquals("4", fizzbuzz.whatToSay(4));
	}
	
	@Test
	public void outputIsFizz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		assertEquals("Fizz", fizzbuzz.whatToSay(3));
		assertEquals("Fizz", fizzbuzz.whatToSay(6));
		assertEquals("Fizz", fizzbuzz.whatToSay(18));
	}


	@Test
	public void outputIsBuzz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		assertEquals("Buzz", fizzbuzz.whatToSay(5));
		assertEquals("Buzz", fizzbuzz.whatToSay(10));
	}
	
	@Test
	public void outputIsFizzBuzz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		assertEquals("FizzBuzz", fizzbuzz.whatToSay(15));
	}
	
	@Test
	public void outputIsFizzIfItHas3() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		assertEquals("Fizz", fizzbuzz.whatToSay(13));
		assertEquals("Fizz", fizzbuzz.whatToSay(23));	
	}
	
	@Test
	public void outputIsBuzzIfItHas5() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		assertEquals("Buzz", fizzbuzz.whatToSay(56));	
	}
}
