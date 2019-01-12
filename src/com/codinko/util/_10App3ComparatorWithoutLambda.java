package com.codinko.util;

import java.util.Arrays;
import java.util.Comparator;

public class _10App3ComparatorWithoutLambda {
	
	public static void main(String[] args) {
		
		String[] names = {"Mr John", "Mr Peter", "Mr Codinko"};
		
		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.split(" ")[1].compareTo(o2.split(" ")[1]);
			}
		});
		
		System.out.println(Arrays.toString(names));
		
	}

}
