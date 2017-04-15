package com.mystudy.patterns;

/**
 * Created by bbose on 4/12/17.
 */
public enum SingletonEnum {
    INSTANCE;

    public void display(){
        System.out.println("Hello Enum Singleton");
    }
}
