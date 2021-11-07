package com.bridgelabz;

public class CalculateMaxOfThreeValues {
	public static void main(String[] args) {
		// Three Integer objects initialization
		Integer firstNumber = 54 ;
		Integer secondNumber = 34 ;
		Integer thirdNumber = 21 ;
		Integer max = firstNumber ;

		// using compareTo method
		if(secondNumber.compareTo(max) > 0) {
			max = secondNumber;
		}
		if(thirdNumber.compareTo(max) > 0) {
			max = thirdNumber ;
		}

		// printing the maximum among three integer objects
		System.out.println("Maximum number is "+max);
	}
}
