package com.mystudy.general;

/**
 * Created by bbose on 4/26/17.
 */
public class PassByValue {

    public static void main(String[] args){
        Integer num = 10;
        System.out.println(num);
    }

    public static void changeValue(Integer num){
        num =20;
    }
}
