package com.mystudy.threadstudy;

/**
 * Created by Sreesha on 5/1/2017.
 */
public class SynchronizationStudy {

    public static void main(String[] args){
        WorkerThread worker = new WorkerThread();
        MyThread1 thread1 = new MyThread1(worker);
        MyThread2 thread2 = new MyThread2(worker);

        thread1.start();
        thread2.start();

        System.out.println("Finished executing main");
    }

}

class WorkerThread {

   static synchronized void printTable(int n) {//method not synchronized
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+" Executing Non Synchronized Method 1 :"+n * i);
            try {
                Thread.sleep(4000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

   static synchronized void printTable1(int n) {//method not synchronized
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+" Executing Non Synchronized Method 2 :"+n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

   synchronized void printTable3(int n) {//method not synchronized
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+" Executing Synchronized Method 1 :"+n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}

class MyThread1 extends Thread{
    WorkerThread thread;
    MyThread1(WorkerThread thread){
        this.thread=thread;
    }

    public void run(){
        thread.printTable(5);
    //    thread.printTable(10);
   //     thread.printTable3(5);
    }
}

class MyThread2 extends Thread{
    WorkerThread thread;
    MyThread2(WorkerThread thread){
        this.thread=thread;
    }

    public void run(){
     //   thread.printTable(100);
        thread.printTable1(1000);
    //    thread.printTable3(10);
    }
}


