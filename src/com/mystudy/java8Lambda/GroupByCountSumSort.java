package com.mystudy.java8Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Sreesha on 4/22/2017.
 */
public class GroupByCountSumSort {

    public static void main(String[] args){

        //Display total count of each element in a List
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        Map<String,Long> result = items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result.toString());



    }
}
