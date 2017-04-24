package com.mystudy.datastructurecoding;

/**
 * Created by Sreesha on 4/23/2017.
 */
public class QueueImpl {

    Integer rear =0;
    Integer front =0;
    Integer size =5;
    Integer[] numArray = new Integer[size];

    public void insert(Integer element){
        if (!isFull()) {
            numArray[rear++] = element;
        }else {
            System.out.println("Queue is Full");
        }
    }

    public Integer remove(){
        return numArray[front++];
    }

    public Boolean isFull(){
        if (rear==size)
            return true;
        else
            return false;
    }

    public Boolean isEmpty(){
        if(rear==front)
            return true;
        else
            return false;
    }

    public Integer getSize(){
        return rear;
    }

    public static void main(String[] args){
        QueueImpl queue = new QueueImpl();
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        System.out.println("Size of Queue is :"+queue.getSize());
        queue.insert(40);
        queue.insert(50);
        queue.insert(60);


        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }
}
