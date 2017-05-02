package com.mystudy.threadstudy;

/**
 * Created by Sreesha on 4/24/2017.
 */
public class ThreadExample {

    public static void main(String[] args){

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        });
        thread.start();
        try {
            thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread1 = new Thread(()->System.out.println("Thread1 is Running"));
        thread1.start();
        try {
            thread1.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main Method");
    }
}
