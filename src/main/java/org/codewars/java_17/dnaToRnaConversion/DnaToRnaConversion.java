package org.codewars.java_17.dnaToRnaConversion;
public class DnaToRnaConversion {
    public String dnaToRna(String dna) {
    	if(dna.contains("U")) {
    		return dna.replace("U", "T");
    	}else {
    		return dna.replace("T", "U");
    	}
    } 
}