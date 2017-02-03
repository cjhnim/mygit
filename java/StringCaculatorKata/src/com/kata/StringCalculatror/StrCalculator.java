package com.kata.StringCalculatror;

public class StrCalculator {

	public static int Add(String numbers) {

		int sum = 0;
		char curChar = 0;

		if (numbers.length() == 0)
			return 0;

		for (int i = 0; i < numbers.length(); i++) {
			curChar = numbers.charAt(i);

			if (Character.isDigit(curChar))
				sum += Character.getNumericValue(curChar);
		}
		return sum;
	}
}
