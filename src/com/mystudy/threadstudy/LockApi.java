package com.mystudy.threadstudy;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by bbose on 5/3/17.
 */
public class LockApi {

    public static void main(String[] args){
        Resource resource = new Resource();
        Lock lock = new ReentrantLock();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
              /*  synchronized (resource) {
                    resource.doPrint();
                } */
                try {
                    if (lock.tryLock(50, TimeUnit.SECONDS)){
                        resource.doPrint();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }

            }

        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
             /*   synchronized (resource) {
                    resource.doShow();
                } */
                try {
                    if (lock.tryLock(50, TimeUnit.SECONDS)){
                        resource.doShow();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
             }
        });

        thread1.start();
        thread2.start();

    }
}

class Resource{

    public void doPrint(){
        for (int i=0;i<5;i++){
            System.out.println("Print Method"+i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void doShow(){
        for (int i=10;i>5;i--){
            System.out.println("Show Method"+i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
