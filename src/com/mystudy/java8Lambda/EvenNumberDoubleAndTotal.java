package com.mystudy.java8Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Sreesha on 4/16/2017.
 */
public class EvenNumberDoubleAndTotal {

    public static void main(String[] args){
        List<Integer> numberList = Arrays.asList(1,3,4,5,6);
        Integer total =0;
        for (Integer number:numberList){
            if (number%2==0)
                total = total + number * 2;
        }
        System.out.println(total);

        System.out.println(
       // numberList.stream().filter(e -> e%2==0).map(e ->e*2).reduce(0,Integer::sum));
                numberList.stream().
                        filter(e -> e%2==0).
                        mapToInt(e ->e*2).sum());

        List<Integer> collectList = numberList.stream().
                                                filter(e -> e%2==0).
                                                map(e -> e*2).
                                                collect(Collectors.toList());



    }
}
