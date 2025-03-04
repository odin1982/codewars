package org.codewars.java_17.ifYouCantSleepJustCountSheep;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Kata {
  public static String countingSheep(int num) {
	 String message = "";
	  for(int i=1;i<=num;i++) {
		 message += i + " sheep..."; 
	 }
	  return message;
  }
  
  public static String countingSheep2(int num) {
	  return IntStream.rangeClosed(1, num)
			  .mapToObj(i -> i + " sheep...")
			  .collect(Collectors.joining());
  }
}