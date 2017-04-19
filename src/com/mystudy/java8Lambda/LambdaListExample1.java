package com.mystudy.java8Lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Sreesha on 4/16/2017.
 */
public class LambdaListExample1 {

    public static void main(String[] args){
    /*    Integer[] numbers1 = {1,2,3,4};
        List<Integer> numberList = Arrays.asList(numbers1); */
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6);
      //  numberList.forEach(numbers -> System.out.println(numbers));
        numberList.forEach(System.out::println);

        //parameter as an argument to a static method
    /*    numberList.stream().
                map(e ->String.valueOf(e)).
                forEach(System.out::print);

        numberList.stream().
                map(String::valueOf).
                forEach(System.out::println); */

        // parameter as a target/ object call
    /*    numberList.stream().
                map(e -> e.toString()).
                forEach(System.out::println);

        numberList.stream().
                map(String::valueOf). //map(e ->String.valueOf(e)).
                map(String::toString).
                forEach(System.out::println); */


        //two parameters as arguments
      /*  numberList.stream().reduce(0,(total,e) ->Integer.sum(total,e));
        numberList.stream().reduce(0,Integer::sum); */

     //   numberList.stream().map(String::valueOf).reduce("",(carry,str) -> carry.concat(str));
        numberList.stream().map(String::valueOf).reduce("",String::concat);


    }
}
