package com.java.programs;

import java.util.Scanner;

public class SubstractionCalculator {

	public static void main(String[] args) throws Exception {

		Double number1, number2, result;

		// create an object of Scanner class
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// ask users to enter numbers
		System.out.println("Enter first number");

		// catch exception when input is not double
		try {
			number1 = input.nextDouble();
		} catch (Exception e) {
			throw new Exception("Wrong input, please try again");
		}

		// ask users to enter numbers
		System.out.println("Enter second number");

		// catch exception when input is not double
		try {
			number2 = input.nextDouble();
		} catch (Exception e) {
			throw new Exception("Wrong input, please try again");
		}

		result = number1 - number2;
		System.out.println(number1 + " - " + number2 + " = " + result);

	}

}
