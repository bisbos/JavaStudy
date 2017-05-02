package com.mystudy.java8LambdaStudy;

import java.util.stream.Stream;

/**
 * Created by Sreesha on 4/30/2017.
 */
public class StreamUnderstandingFlow {

    public static void main(String[] args){
        System.out.println("-----------------------------------");
        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .forEach(s -> System.out.println("forEach: " + s));
        System.out.println("-----------------------------------");


        System.out.println("-----------------------------------");
        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));
        System.out.println("-----------------------------------");
    }
}
