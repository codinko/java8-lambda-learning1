package com.codinko.util;

import java.util.function.Function;

public class _4App1WithMethodReference {

	public static void main(String[] args) {
		System.out.println(process("hello world", String::toUpperCase));

	}

	private static String process(String string, Function<String, String> processor) {

		return processor.apply(string);
	}

}
