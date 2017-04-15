package com.mystudy.java8Lambda;

/**
 * Created by bbose on 4/13/17.
 */
public class MethodReference {

    public static void main(String[] args){

      //  Thread t = new Thread(() -> printMessage());
        Thread t = new Thread(MethodReference::printMessage);
        t.start();
    }

    public static void printMessage(){
        System.out.println("Hello Method Referrence");
    }
}
