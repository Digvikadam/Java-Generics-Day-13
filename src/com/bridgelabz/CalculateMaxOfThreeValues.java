package com.bridgelabz;

public class CalculateMaxOfThreeValues <T extends Comparable> {
	T firstValue, secondValue, thirdValue ;

	//constructor
	public CalculateMaxOfThreeValues(T firstValue, T secondValue, T thirdValue) {
		super();
		this.firstValue = firstValue;
		this.secondValue = secondValue;
		this.thirdValue = thirdValue;
	}

	public static void main(String[] args) {
		//providing the type using generics at runtime
		CalculateMaxOfThreeValues<Integer> maxInt = new CalculateMaxOfThreeValues<Integer>(10,30,12);
		maxInt.findMax();

		CalculateMaxOfThreeValues<Float> maxFloat = new CalculateMaxOfThreeValues<Float>(10.33f,10.44f,10.45f);
		maxFloat.findMax();

		CalculateMaxOfThreeValues<String> maxString = new CalculateMaxOfThreeValues<String>("ram","ramesh","rama");
		maxString.findMax();
	}

	public <E extends Comparable> void findMax() {
		T max = firstValue ;

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