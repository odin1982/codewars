package org.codewars.java_17.dnaToRnaConversion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DnaToRnaConversionTest {
    @Test
    public void testDna() throws Exception {
    	DnaToRnaConversion b = new DnaToRnaConversion();
        assertEquals("UUUU", b.dnaToRna("TTTT"));
    }
    
    @Test
    public void testDna2() throws Exception {
    	DnaToRnaConversion b = new DnaToRnaConversion();
        assertEquals("GCAU", b.dnaToRna("GCAT"));
    }
}