package com.codinko.util;

import java.util.Arrays;
import java.util.Comparator;

public class _14App3ComparatorWithStaticUtilityAndMethodReferences {

	public static void main(String[] args) {

		String[] names = { "Mr John", "Mr Peter", "Mr Codinko" };

		Arrays.sort(names, Comparator.comparing(_14App3ComparatorWithStaticUtilityAndMethodReferences::firstName).reversed()

		);

		System.out.println(Arrays.toString(names));

	}

	public static String firstName(String string) {
		return string.split(" ")[1];
	}

}

/**
 * 
 * In addition here we have used reversed() as well that also returns a comparator.
 */
