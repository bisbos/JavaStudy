package com.mystudy.datastructurecoding;

import org.junit.Test;

/**
 * Created by Sreesha on 4/23/2017.
 */
public class StackImpl {
    Integer size = 5;
    Integer[] numberArray = new Integer[size];
    Integer top =0;

    public void push(Integer element){
        if (!isFull())
            numberArray[top++] = element;
        else {
            System.out.println("Stack is Full");
        }
    }

    public Integer pop(){
            return numberArray[--top];
    }

    public Boolean isEmpty(){
        return top==0;
    }

    public Boolean isFull(){
        return top==size;
    }

    public static void main(String[] args){
        StackImpl stack = new StackImpl();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);
        stack.push(600);

        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }

}
