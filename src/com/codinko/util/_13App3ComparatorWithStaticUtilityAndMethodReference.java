package com.codinko.util;

import java.util.Arrays;
import java.util.Comparator;

public class _13App3ComparatorWithStaticUtilityAndMethodReference {

	public static void main(String[] args) {

		String[] names = { "Mr Zohn", "Ms Adam", "Mr Codinko", "Mr Adam" };

		Arrays.sort(names, Comparator.comparing(_13App3ComparatorWithStaticUtilityAndMethodReference::firstName)
				.reversed().thenComparing(_13App3ComparatorWithStaticUtilityAndMethodReference::title)

		);

		System.out.println(Arrays.toString(names));

	}

	public static String firstName(String string) {
		return string.split(" ")[1];
	}

	public static String title(String string) {
		return string.split(" ")[0];
	}

}

/**
 * There are many such useful default and static methods.
 */

