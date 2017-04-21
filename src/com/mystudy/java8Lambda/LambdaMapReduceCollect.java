package com.mystudy.java8Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Sreesha on 4/16/2017.
 */
public class LambdaMapReduceCollect {

    public static void main(String[] args){
        List<Integer> numberList = Arrays.asList(1,3,4,5,6);
        Integer total =0;
        for (Integer number:numberList){
            if (number%2==0)
                total = total + number * 2;
        }
        System.out.println(total);

        //map transforms value. Map takes Function<T,R> to return Stream<R>
        System.out.println(
       // numberList.stream().filter(e -> e%2==0).map(e ->e*2).reduce(0,Integer::sum));
                numberList.stream().
                        filter(e -> e%2==0).
                        mapToInt(e ->e*2).sum());


        //collect can be used to create List,Set and Map
        List<Integer> collectList = numberList.stream().
                                                filter(e -> e%2==0).
                                                map(e -> e*2).
                                                collect(Collectors.toList());

        System.out.println(collectList);

        //reduce is used to do operations on the stream and produce a result
      System.out.println
        (numberList.stream().
                filter(e -> e%2==0).
                map(e -> e*2).
                reduce(0,(carry,e) -> carry + e));

    }
}
