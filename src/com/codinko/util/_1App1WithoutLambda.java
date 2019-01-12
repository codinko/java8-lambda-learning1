package com.codinko.util;

public class _1App1WithoutLambda {

	public static void main(String[] args) {
		System.out.println(process("hello world", // passing object or passing code or passing behavior
				new Processor() {
					@Override
					public String process(String string) {
						return string.toUpperCase();
					}
				}));
	}

	private static String process(String string, Processor processor) {

		return processor.process(string);
	}

}

interface Processor {
	String process(String string);
}
