package org.codewars.java_17.sumMixedArray;

import java.util.List;

public class MixedSum {

	/*
	 * Assume input will be only of Integer o String type
	 */
	public int sum(List<?> mixed) {
		int sum = 0;
		for (Object number : mixed) {
			int element = 0;
			if (number instanceof String cadena) {
				element = Integer.valueOf(cadena).intValue();
				sum += element;
			}

			if (number instanceof Integer entero) {
				element = entero.intValue();
				sum += element;
			}
		}
		return sum;

	}
	
	public int sumImproved(List<?> mixed) {
		return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
	}
}