package com.bridgelabz;

public class CalculateMaxOfThreeValues {
	public static void main(String[] args) {
		findMax(10,30,12);  // finding maximum for integers
		findMax(10.33f,10.44f,10.45f); // finding maximum for floats
		findMax("ram","ramesh","rama"); // finding maximum for Strings
	}
 
	// reliability to choose any type of variable at method level
	public static <E extends Comparable> void findMax(E firstValue , E secondValue , E thirdValue ) {
		E max = firstValue ;

		// using compareTo method
		if(secondValue.compareTo(max) > 0) {
			max = secondValue;
		}
		if(thirdValue.compareTo(max) > 0) {
			max = thirdValue ;
		}

		// printing the maximum among three String objects
		System.out.println("Maximum is "+max);
	}
}
