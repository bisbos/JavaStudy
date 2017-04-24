package com.mystudy.java8Lambda;

import java.util.Arrays;

/**
 * Created by Sreesha on 4/23/2017.
 */
public class ConvertStringToChar {

    public static void main(String[] args){
        String name ="Bisin";
        name.chars().mapToObj(e ->(char)e).forEach(System.out::println);
    }
}
