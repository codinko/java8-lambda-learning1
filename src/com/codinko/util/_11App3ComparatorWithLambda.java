package com.codinko.util;

import java.util.Arrays;
import java.util.Comparator;

public class _11App3ComparatorWithLambda {

	public static void main(String[] args) {

		String[] names = { "Mr John", "Mr Peter", "Mr Codinko" };

		Arrays.sort(names, (o1, o2) -> o1.split(" ")[1].compareTo(o2.split(" ")[1])

		);

		System.out.println(Arrays.toString(names));

	}

}
