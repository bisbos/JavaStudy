package com.mystudy.general;

/**
 * Created by bbose on 4/12/17.
 */
public class StaticTest {

    StaticTest(){
        System.out.println("In Constructor");
    }

    {
       System.out.println("In Block");
    }

    static {
        System.out.println("In Static block");
    }

    public static void main(String[] args){
        StaticTest test = new StaticTest();
    }
}
