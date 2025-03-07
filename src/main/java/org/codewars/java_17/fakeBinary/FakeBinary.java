package org.codewars.java_17.fakeBinary;

import java.util.stream.Collectors;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        return numberString.chars()
        .mapToObj(caracter -> (char)caracter)
        .map(i-> i<'5'?'0':'1')
        .map(String::valueOf)
        .collect(Collectors.joining());
    }
    
    public static String fakeBin2(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}