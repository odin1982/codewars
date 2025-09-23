package org.codewars.java_17.printingArrayElementsWithCommaDelimiters;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayPrinter {

    public static String printArray(Object[] array) {
    	return Arrays.stream(array).map(element -> element.toString()).collect(Collectors.joining(","));
    }
}