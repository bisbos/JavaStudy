package com.mystudy.threadstudy;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by bbose on 5/1/17.
 */
public class AtomicStudy {

    public static void main(String[] args){
        NonAtomicWorkerThread workerThread = new NonAtomicWorkerThread();
        Thread thread1 = new Thread(workerThread);
        Thread thread2 = new Thread(workerThread);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
            System.out.println("Processing Count :"+workerThread.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        AtomicWorkerThread workerThread1 = new AtomicWorkerThread();
        Thread thread3 = new Thread(workerThread1);
        Thread thread4 = new Thread(workerThread1);
        thread3.start();
        thread4.start();
        try {
            thread3.join();
            thread4.join();
            System.out.println("Processing Atomic Count :"+workerThread1.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class NonAtomicWorkerThread implements Runnable{

    private int count;

    @Override
    public void run() {
        for (int i=0;i<5;i++) {
            makeThreadwait();
            count++;
        }
    }

    public Integer getCount(){
        return count;
    }

    public void makeThreadwait(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class AtomicWorkerThread implements Runnable{

    private AtomicInteger count = new AtomicInteger();

    @Override
    public void run() {
        for (int i=0;i<5;i++) {
            makeThreadwait();
            count.incrementAndGet();
        }
    }

    public Integer getCount(){
        return count.get();
    }

    public void makeThreadwait(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

