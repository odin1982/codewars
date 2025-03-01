package org.codewars.java_17.findTheIntegral;

public class FindTheIntegral {
	public static String integrate(int coefficient, int exponent) {
		int secondArgument = exponent + 1;
		return Integer.divideUnsigned(coefficient, secondArgument)+"x^"+secondArgument;
	}
	
//	 public static String integrate(int coefficient, int exponent) {
//	        return coefficient / ++exponent + "x^" + exponent;
//	 }
}
