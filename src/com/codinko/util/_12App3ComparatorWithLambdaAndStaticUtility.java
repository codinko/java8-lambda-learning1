package com.codinko.util;

import java.util.Arrays;
import java.util.Comparator;

public class _12App3ComparatorWithLambdaAndStaticUtility {

	public static void main(String[] args) {

		String[] names = { "Mr John", "Mr Peter", "Mr Codinko" };

		Arrays.sort(names, Comparator.comparing(o -> o.split(" ")[1])

		);

		System.out.println(Arrays.toString(names));

	}

}

/**
 * 
 * Java 8 provides this type of static helper methods inside Interfaces.
 * 
 * Starting with Java 8, Interfaces can have static helper methods which are
 * fully implemented plus default methods plus the usual abstract method.
 * Interfaces with only one abstract method is called a Functional Interface.
 * 
 */