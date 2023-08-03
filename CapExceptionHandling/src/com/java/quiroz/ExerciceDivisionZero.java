package com.java.quiroz;

public class ExerciceDivisionZero {

    public static void main(String... args) {
        int x = 1;
        int y = 0;
        //You need a boolean in the if condition
        if(x/y == 0) System.out.println("Good");
        else
            System.out.println("Bad");
    }
}
