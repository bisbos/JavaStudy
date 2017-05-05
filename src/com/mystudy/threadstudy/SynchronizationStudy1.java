package com.mystudy.threadstudy;

/**
 * Created by bbose on 5/1/17.
 */
public class SynchronizationStudy1 {

    public static void main(String[] args){
        Lockworker lockworker = new Lockworker();
        MyThread3 thread3 = new MyThread3(lockworker);
        MyThread4 thread4 = new MyThread4(lockworker);

        thread3.start();
        thread4.start();

    }
}

class MyThread3 extends Thread{
    Lockworker lockworker;

    MyThread3(Lockworker lockworker){
        this.lockworker = lockworker;
    }

    @Override
    public void run() {
        lockworker.incrementfirstcount();
    }
}

class MyThread4 extends Thread{
    Lockworker lockworker;

    MyThread4(Lockworker lockworker){
        this.lockworker = lockworker;
    }

    @Override
    public void run() {
        lockworker.incrementsecondcount();
    }
}

class Lockworker{

    Integer count1 =0;
    Integer count2 =0;
    Object lock1 = new Object();
    Object lock2 = new Object();

    public void incrementfirstcount(){
        synchronized (lock1){
            try {
                System.out.println("Incementing Count 1");
                Thread.sleep(5000);
                count1++;
                System.out.println("Incemented Count 1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void incrementsecondcount(){
        synchronized (lock2){
                System.out.println("Incementing Count 2");
                count2++;
                System.out.println("Incemented Count 2");
        }
    }
}
