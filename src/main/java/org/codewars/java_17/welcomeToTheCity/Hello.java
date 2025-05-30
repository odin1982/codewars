package org.codewars.java_17.welcomeToTheCity;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Hello {
	public String sayHello(String[] name, String city, String state) {
		String collect = Arrays.stream(name).collect(Collectors.joining(" "));
		return "Hello, " + collect + "! Welcome to " + city + ", " + state +"!";
	}
	
	public String sayHello2(String[] name, String city, String state){
	    return String.format("Hello, %s! Welcome to %s, %s!",String.join(" ", name),city,state);
	  }
}