package com.codinko.util;

import java.util.function.BiFunction;

public class _5App1WithLambdaBiFunction {

	public static void main(String[] args) {

		System.out.println(process2("hello world", 5, (string, number) -> string.substring(number)));

	}

	private static String process2(String string, Integer number, BiFunction<String, Integer, String> processor) {
		return processor.apply(string, number);
	}

}


/**

java.util.function.BiFunction<String, Integer, String>

@FunctionalInterface
Represents a function that accepts two arguments and produces a result. This is the two-arity specialization of Function.

This is a functional interface whose functional method is apply(Object, Object).

Type Parameters:
<T> the type of the first argument to the function
<U> the type of the second argument to the function
<R> the type of the result of the function
Since:
1.8


*/