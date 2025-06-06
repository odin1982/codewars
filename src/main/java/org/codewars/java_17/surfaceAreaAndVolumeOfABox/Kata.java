package org.codewars.java_17.surfaceAreaAndVolumeOfABox;
public class Kata {
    public static int[] getSize(int w,int h,int d) {
        int[] result = {((2*d*w) + (2*d*h) + (2*w*h)),(w*h*d)};
        return result;
    }
}