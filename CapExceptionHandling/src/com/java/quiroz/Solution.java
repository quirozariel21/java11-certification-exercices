package com.java.quiroz;

import java.io.*;
import java.util.*;

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function


        if(!isValid(a) || !isValid(b)) {
            return false;
        }

        if(a.length() != b.length()) {
            return false;
        }

        char tempArrayA[] = a.toUpperCase().toCharArray();
        char tempArrayB[] = b.toUpperCase().toCharArray();
        Arrays.sort(tempArrayA);
        Arrays.sort(tempArrayB);

        String wordA = new String(tempArrayA);
        String wordB = new String(tempArrayB);
        System.out.println(wordA);
        System.out.println(wordB);

        if(wordA.equals(wordB)) {
            return true;
        }
        return false;
    }

    static boolean isValid(String word) {
        if(word.length() >= 1 && word.length() <= 50)
            return true;
        return false;
    }



    public static void main(String[] args) {

        /*Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );*/

        Map<String, String> map = Map.of("2", "b", "1", "a", "4", "c", "5", "e");
        var valuesArray = map.values().stream().sorted().toArray();
        var keysArray = map.keySet().stream().sorted().toArray();
        Arrays.stream(valuesArray).forEach(System.out::println);
        Arrays.stream(keysArray).forEach(System.out::println);
    }
}
