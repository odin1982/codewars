package org.codewars.java_17.countOfPositivesSumOfNegatives;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

// retorna una arreglo, donde el primer elemento es la cuenta de cuantas numeros positivos hay
// y el segundo elemento es la suma de los numeros negativos
// 0 no es ni positivo ni negativo
//For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15],
// you should return [10, -65].
public class CountOfPositivesSumOfNegatives {


	public static int[] countPositivesSumNegatives(int[] input) {
		if (input == null || input.length == 0) return new int[] {};
		int count = 0,sum = 0;
		for (int i : input) {
			if (i > 0) count ++;
			if (i < 0) sum += i;
		}
		return new int[] {count,sum};
	}
}
