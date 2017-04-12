package com.mystudy.java8Lambda;

/**
 * Created by Sreesha on 4/11/2017.
 */
public class LambdaRunnable {

    public static void main(String[] args){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        });

        t1.start();
    }


    Thread t2 = new Thread(() -> System.out.println("hello"));


}
