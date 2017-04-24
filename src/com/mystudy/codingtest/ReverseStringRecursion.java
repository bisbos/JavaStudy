package com.mystudy.codingtest;

import org.junit.Test;

/**
 * Created by Sreesha on 4/23/2017.
 */
public class ReverseStringRecursion {

    public String reverseString(String value){
        StringBuilder stringBuilder = new StringBuilder(value);
      //  StringBuilder reversedString = stringBuilder.reverse();
        char[] valueArray = value.toCharArray();
        char[] reversedArray= new char[valueArray.length];
        int j=0;
        for (int i=valueArray.length-1;i>=0;i--){
            reversedArray[j++]=valueArray[i];
        }
        return String.valueOf(reversedArray);
    }

    public String reverseStringRecursion(String value){
        if (value.length()<=0)
            return value;
        else
        return reverseStringRecursion(value.substring(1))+value.charAt(0);
    }

    @Test
    public void testReverseString(){
        System.out.println(reverseString("Bisin"));
    }

    @Test
    public void testReverseStringRecursion(){
        System.out.println(reverseStringRecursion("Bisin"));
    }
}
