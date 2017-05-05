package com.mystudy.threads;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by bbose on 4/26/17.
 */
public class BlockingQueueExample {

    public static void main(String[] args){

        BlockingQueue<Message> queue = new ArrayBlockingQueue<Message>(10);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        new Thread(producer).start();
        new Thread(consumer).start();

    }
}

class Message{
    private String msg;

    public String getMsg() {
        return msg;
    }

    public Message(String str){
        this.msg=str;
    }
}

class Producer implements Runnable{

    BlockingQueue<Message> queue;

    public Producer(BlockingQueue<Message> queue){
        this.queue=queue;
    }

    @Override
    public void run() {
        for (int i=1;i<10;i++) {
            Message msg = new Message(String.valueOf(i));
            try {
                Thread.sleep(1000);
                queue.put(msg);
                System.out.println("Produced :"+msg.getMsg());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Message newMessage = new Message("exit");
        try {
            queue.put(newMessage);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable{

    BlockingQueue<Message> queue;

    public Consumer(BlockingQueue<Message> queue){
        this.queue=queue;
    }

    @Override
    public void run() {
        Message msg;
        try {
            while ((msg=queue.take()).getMsg()!="exit"){
                System.out.println("Consumed :"+msg.getMsg());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
