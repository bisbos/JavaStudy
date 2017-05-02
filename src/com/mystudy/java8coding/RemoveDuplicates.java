package com.mystudy.java8coding;


import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by bbose on 4/18/17.
 *
 Ex: "aaab", 2 => "aab"
 Ex: "aabb", 1 => "ab"
 Ex: "aabbaa", 1 => "aba
 */


public class RemoveDuplicates {


    public static void main(String[] args){
        String value="aaab";
        System.out.println(removeDuplicates(value,2));
        value="aabbaa";
        System.out.println(removeDuplicates(value,1));
        value="aabb";
        System.out.println(removeDuplicates(value,1));

        System.out.println("-----------------------------------");
        removeDuplicatesJava8(value,1);
    }

    public static String removeDuplicates(String value,Integer maxConsecutiveChar){
        char[] charArray = value.toCharArray();
        String returnString = new String();
        char previousletter='\0';
        Integer count =0;
        for (char letter:charArray) {
            if (letter != previousletter) {
                count = 0;
            }
            if (count < maxConsecutiveChar) {
                returnString = returnString + letter;
                count++;
            }
            previousletter = letter;
            }


        return returnString;
        }


        public static void removeDuplicatesJava8(String value,Integer maxConsecutiveChar){
            Integer count =0;

        }

}
