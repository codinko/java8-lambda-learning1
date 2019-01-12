package com.codinko.util;

import java.util.function.Function;

public class _9App2WithLambdaWhyNeedOfFinal {

	public static void main(String[] args) {

		//STEP1: String prefix = "MR. ";
		//STEP 2
		final String prefix = "MR. ";
		
		System.out.println(process("Hello World", (string) -> {
			// compile error : Local variable prefix defined in an enclosing scope must be
			// final or effectively final . Compiler says its effectively final only, so
			//STEP 2:  let's declare it as final so you don't tempt to change it !
			
			//STEP 1:  prefix = "Ms";
			return prefix.concat(string);
		}));
	}

	private static String process(String string, Function<String, String> processor) {

		return processor.apply(string);
	}

}

/**
 * 
 * You cannot change the value of a local variable of outer scope inside a
 * lambda expression. ie: here you cannot change value of prefix inside lambda
 * expression. For that same reason, it is advised to declare that local
 * variable as final so it is explicit for developer.
 * 
 * 
 */
