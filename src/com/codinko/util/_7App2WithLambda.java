package com.codinko.util;

import java.util.function.Function;

public class _7App2WithLambda {

	public static void main(String[] args) {
		
		String prefix = "MR. ";
		System.out.println(process("Hello World", string -> prefix.concat(string)));
	}

	private static String process(String string, Function<String, String> processor) {

		return processor.apply(string);
	}

}
