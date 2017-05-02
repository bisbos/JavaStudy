package com.mystudy.java8coding;

import java.util.Arrays;

/**
 * Created by Sreesha on 4/30/2017.
 */
public class FindDuplicates {

    public static void main(String[] args){
        Integer[] numbers = new Integer[]{1,2,1,3,4,4};
        Arrays.stream(numbers).distinct().forEach(System.out::println);
    }
}
