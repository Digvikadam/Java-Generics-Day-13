package com.bridgelabz;

public class CalculateMaxOfThreeValues {
	public static void main(String[] args) {
		// Three String objects initialization
		String firstNumber = "ram";
		String secondNumber = "ramesh" ;
		String thirdNumber = "rama" ;

		String max = firstNumber ;

		// using compareTo method
		if(secondNumber.compareTo(max) > 0) {
			max = secondNumber;
		}
		if(thirdNumber.compareTo(max) > 0) {
			max = thirdNumber ;
		}

		// printing the maximum among three String objects
		System.out.println("Maximum string is:"+max);
	}
}
