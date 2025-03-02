package com.techlogy.java8.examples;

@FunctionalInterface
interface Calculator {
	public Integer calculate(String operation, Integer a, Integer b);

}

public class LambdaExpressionExample {

//	@Override
//	public void calculate(String operation, Integer a, Integer b) {
//
//		Integer result;
//		switch (operation) {
//		case "+":
//			result = a + b;
//			break;
//		case "*":
//			result = a * b;
//		case "/":
//			result = a / b;
//
//		default:
//			System.out.println(" **Calculation is not supported. ");
//			break;
//		}
//
//	}
	
	public static void main(String[] args) {
		Calculator cal = (operation, a, b) -> {

			Integer result = 0;
			switch (operation) {
			case "+":
				result = a + b;
				break;
			case "*":
				result = a * b;
				break;
			case "/":
				result = a / b;
				break;

			default:
				break;
			}
			return result;

		};

		System.out.println(" Sum of 2 numbers :: " + cal.calculate("+", 2, 5));
		System.out.println(" Multiplication of 2 numbers :: " + cal.calculate("*", 7, 5));
		System.out.println(" Division of 2 numbers :: " + cal.calculate("/", 30, 5));

	}
		
	
	
	
	
	
}	


