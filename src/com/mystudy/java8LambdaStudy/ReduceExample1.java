package com.mystudy.java8LambdaStudy;

import java.util.Arrays;
import java.util.function.Function;

/**
 * Created by Sreesha on 4/30/2017.
 */
public class ReduceExample1 {

    public static void main(String[] args){
        String[] myArray = { "this", "is", "a", "sentence" };
        String senetence = Arrays.stream(myArray).reduce("",(a,b)->a+" "+b);
        System.out.println(senetence);

        senetence = Arrays.stream(myArray).limit(2).reduce("",(a,b)->a+" "+b);
        System.out.println(senetence);
    }
}
