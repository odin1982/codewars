package org.codewars.java_17.sortAndStar;

import java.util.Arrays;

public class SortAndStar {
    public static String twoSort(String[] s){
        StringBuilder cadena = new StringBuilder();
        Arrays.sort(s);
        for(int i=0; i<s[0].length();i++){

            if(i != s[0].length()-1){
                cadena.append(s[0].charAt(i)+"***");
            }else{
                cadena.append(s[0].charAt(i));
            }
        }
        return cadena.toString();
    }

    public static String twoSort2(String[] s){
        Arrays.sort(s);
        return String.join("***",s[0].split(""));
    }

    public static String twoSort3(String[] s) {
        return String.join("***", Arrays.stream(s).sorted().findFirst().orElse("").split(""));
    }

}
