package com.mystudy.java8Lambda;

/**
 * Created by Sreesha on 4/11/2017.
 */
public class LambdaExample2 {

    public static void main(String[] args){
        printString(str ->str.length());
    }

    public static void printString(Greeting1 greeting1){
        System.out.println(greeting1.greet("Bisin"));
    }
}

interface Greeting1{
    public Integer greet(String s);
}
