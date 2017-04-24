package com.mystudy.codingtest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by Sreesha on 4/21/2017.
 */
public class FindMaxandMin {

    public static void main(String[] args){
        Integer[] numberArray = {18,6,29,21,32,8,11,25,14,26,21,2,40};

     //   getMaxAndMin(numberArray);
        getMaxAndMinJava8(numberArray);

    }

    public static void getMaxAndMin(Integer[] numberArray){
        Integer min = Integer.MAX_VALUE;
        Integer max = Integer.MIN_VALUE;
        System.out.println(min+" "+max);

        for(int i=0;i<numberArray.length;i++){
            if(min>numberArray[i])
                min = numberArray[i];
            if (max<numberArray[i])
                max = numberArray[i];
        }

        System.out.println("Minimum Number :"+min);
        System.out.println("Maximum Number :"+max);
    }

    public static void getMaxAndMinJava8(Integer[] numberArray){
       List<Integer> numberList = Arrays.asList(numberArray);
       Optional<Integer> maxNumber = Arrays.stream(numberArray).max(Comparator.naturalOrder());
        System.out.println(maxNumber.get());
        Optional<Integer> minNumber = Arrays.stream(numberArray).min(Comparator.naturalOrder());
        System.out.println(minNumber.get());


        Integer maxNumber1 = Arrays.stream(numberArray).reduce(Integer.MIN_VALUE,(a,b)->Integer.max(a,b));
        Integer minNumber1= Arrays.stream(numberArray).reduce(Integer.MAX_VALUE,(a,b)->Integer.min(a,b));
        System.out.println(maxNumber1);
        System.out.println(minNumber1);

        Optional<Integer> maxNumber2 = Arrays.stream(numberArray).reduce(Integer::max);
        Optional<Integer> minNumber2 = Arrays.stream(numberArray).reduce(Integer::min);
        System.out.println(maxNumber2.get());
        System.out.println(minNumber2.get());

       // numberList.stream().map(e -> e*2).reduce(0,(a,b) ->Integer.sum(a,b));
    }
}
