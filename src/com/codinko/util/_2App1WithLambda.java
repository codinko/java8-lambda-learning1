package com.codinko.util;

public class _2App1WithLambda {

	public static void main(String[] args) {
		System.out.println(process("hello world", string -> string.toUpperCase()));
	}

	private static String process(String string, ProcessorI processor) {
		return processor.process(string);
	}

}

//This annotation is for your understanding, and just optional.
@FunctionalInterface
interface ProcessorI {
	String process(String string);
}

//STEP 1 [lambda expression]

// wherever an object of functional interface can go, you can pass a lambda expression there.
