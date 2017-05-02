package com.mystudy.java8LambdaStudy;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Created by Sreesha on 4/29/2017.
 */
public class SupplierStream {

    public static void main(String[] args){
        Stream<String> myStream = Stream.of("c","b","a","h","g","d").filter(p->p.equals("a"));
        myStream.forEach(System.out::println);
      //  myStream.forEach(System.out::println);

        Supplier<Stream<String>> streamSupplier = () -> Stream.of("c","b","a","h","g","d").filter(p->p.equals("a"));
        streamSupplier.get().forEach(System.out::println);
        streamSupplier.get().forEach(System.out::println);
    }
}
