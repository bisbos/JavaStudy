package com.mystudy.java8coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Sreesha on 4/30/2017.
 */
public class RemoveDuplicateWords {

    public static void main(String[] args){
        List<String> allWords = Arrays.asList(
                "call", "feel", "call", "very", "call", "very", "feel", "very", "any");
        Set<String> commonlyUsed = allWords.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()>2)
                .map(Map.Entry::getKey).collect(Collectors.toSet());
        System.out.println(commonlyUsed);




    }
}
