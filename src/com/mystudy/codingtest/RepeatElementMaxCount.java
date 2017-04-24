package com.mystudy.codingtest;

import java.util.Arrays;

/**
 * Created by Sreesha on 4/21/2017.
 */
/* aaab 2 --> ab
    aabbaa 1 -->aba
    aabb 1--> ab
 */
public class RepeatElementMaxCount {

    public static void main(String[] args){
        String value ="aaab";
        System.out.println(getNewString(value,2));

        String value1 ="aabb";
        System.out.println(getNewString(value1,1));

        String value2 ="aabbaa";
        System.out.println(getNewString(value2,1));
    }

    public static String getNewString(String value,Integer recordCount){
        String newString = new String();
        Integer count =0;
        char currentElement='\0';
        for (char element:value.toCharArray()) {
            if (currentElement != element) {
                currentElement = element;
                count =0;
            }
            if (count < recordCount) {
                newString = newString + element;
                count++;
            }
        }
        return newString;
    }

   /* public static String getNewStringJava8(String value,Integer recordCount){
        value.chars().

    } */
}
