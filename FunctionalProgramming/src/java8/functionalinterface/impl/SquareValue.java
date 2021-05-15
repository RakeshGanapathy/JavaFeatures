package java8.functionalinterface.impl;

import java.util.function.Function;

public class SquareValue {
	
	public int cubeIt(int n) {
		return n* n*n;
	}

	public static void main(String[] args) {
		Calculatable cal = (n)->n*n*n;
		System.out.println("the cube is "+cal.calculate(6));
		Calculatable cal1 =(n)->n*n*n*n;
		System.out.println("the input to the power "+cal1.calculate(10));
		Function<Integer, Integer> f = i -> i * i;
		System.out.println("the square value of a " + f.apply(5));
		System.out.println("the square value of a " + f.apply(7));
		f = i -> i * i * i;
		/*
		 * @FunctionalInterface
		 * Function<T,R>
		 * 
		 * Represents a function that accepts one argument and produces a result.
		 * This is a functional interface whose functional method is apply(Object). Type
		 * Parameters:<T> the type of the input to the function<R> the type of the
		 * result of the function
		 */
		System.out.println("the cube value " + f.apply(9));
	}

}
