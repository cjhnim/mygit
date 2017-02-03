package com.kata.FizzBuzz;

public class FizzBuzz {

	public String whatToSay(int number) {

		if (isFizz(number) & isBuzz(number))
			return "FizzBuzz";
		else if (isFizz(number))
			return "Fizz";
		else if (isBuzz(number))
			return "Buzz";
		else
			return Integer.toString(number);
	}

	private boolean isBuzz(int number) {
		return number % 5 == 0 || Integer.toString(number).contains("5");
	}

	private boolean isFizz(int number) {
		return number % 3 == 0 || Integer.toString(number).contains("3");
	}

}
