package com.codinko.util;

import java.util.function.Function;

public class _3App1WithLambdaAndFunction {

	public static void main(String[] args) {
		System.out.println(process("hello world", string -> string.toUpperCase()));
	}

	private static String process(String string, Function<String, String> processor) {
		return processor.apply(string);
	}

}

//STEP 1 [lambda expression]

// wherever an object of functional interface can go, you can pass a lambda
// expression there.

//STEP 2   [Function<T, R> interface usage]

// Java 8 already provides a lot of built-in functional interfaces and one of
// them is
// a Function interface ie: Function<T, R> which is similar to our Processor
// interface here
// so we can replace our Processor interface here with that.

/**

java.util.function.Function<String, String>

@FunctionalInterface
Represents a function that accepts one argument and produces a result.

This is a functional interface whose functional method is apply(Object).

Type Parameters:
<T> the type of the input to the function
<R> the type of the result of the function
Since:
1.8

*/