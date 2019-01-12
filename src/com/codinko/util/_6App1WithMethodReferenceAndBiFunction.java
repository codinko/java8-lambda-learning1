package com.codinko.util;

import java.util.function.BiFunction;

public class _6App1WithMethodReferenceAndBiFunction {

	public static void main(String[] args) {

		System.out.println(process2("hello world", 5, String::substring));

	}

	private static String process2(String string, Integer number, BiFunction<String, Integer, String> processor) {
		return processor.apply(string, number);
	}

}
