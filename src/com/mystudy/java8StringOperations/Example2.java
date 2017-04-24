package com.mystudy.java8StringOperations;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Sreesha on 4/21/2017.
 */
public class Example2 {

    public static void main(String[] args){
        //foreach example
        List<Integer> numberList = Arrays.asList(1,2,3,4,5);
         numberList.forEach(x -> System.out.println(x));

        numberList.forEach(x->{
            if(x==2)
                System.out.println(x);
        });
    }
}


