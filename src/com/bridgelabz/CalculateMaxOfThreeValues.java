package com.bridgelabz;

public class CalculateMaxOfThreeValues {
	public static void main(String[] args) {
		// Three Float objects initialization
		Float firstNumber = 54.34f ;
		Float secondNumber = 34.33f ;
		Float thirdNumber = 54.65f ;

		Float max = firstNumber ;

		// using compareTo method
		if(secondNumber.compareTo(max) > 0) {
			max = secondNumber;
		}
		if(thirdNumber.compareTo(max) > 0) {
			max = thirdNumber ;
		}
		// printing the maximum among three Float objects
		System.out.println("Maximum number is "+max);
	}
}
