package com.mystudy.codingtest;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sreesha on 4/28/2017.
 */
public class PermutationString {

    public static void main(String[] args){
        printPermutaion("ABC".toCharArray(),0);
    }


    public static void printPermutaion(char[] input,int focusElement){
        if(focusElement==input.length-1){
            System.out.println(String.valueOf(input));
            return;
        }

        printPermutaion(input,focusElement+1);

        for (int i=focusElement+1;i<input.length;i++){
            char temp = input[focusElement];
            input[focusElement]=input[i];
            input[i]=temp;

            printPermutaion(input, focusElement+1);
        }
    }
}
