package com.codinko.util;

import java.util.function.Function;

public class _8App2WithMethodReference {

	public static void main(String[] args) {
		
		String prefix = "MR. ";
		System.out.println(process("Hello World", prefix::concat));
	}

	private static String process(String string, Function<String, String> processor) {

		return processor.apply(string);
	}

}
