package org.codewars.java_17.abbreviateATwoWordName;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AbbreviateTwoWords {

	public static String abbrevName(String name) {
		String[] nameSplited = name.split(" ");
		String result = "";
		for (int i = 0; i < nameSplited.length; i++) {
			nameSplited[i] = nameSplited[i].substring(0, 1).toUpperCase();
		}

		result = nameSplited[0] + "." + nameSplited[1];
		return result;
	}

	public static String abbrevName2(String name) {
		return Arrays.stream(name.split(" ")).map(String::toUpperCase).map(word -> word.substring(0, 1))
				.collect(Collectors.joining("."));

	}

	public static String abbrevName3(String name) {
		return name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2");
	}

}