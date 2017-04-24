package com.mystudy.datastructurecoding;

/**
 * Created by Sreesha on 4/23/2017.
 */
public class LinkedListImpl {

    Link first;

    public void insertFirst(Integer data){
        Link newLink = new Link(data);
        newLink.next = first;
        first = newLink;
    }

    public void deleteFirst(){
        first = first.next;
    }

    public void display(){
        Link current = first;
        while(null!=current) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args){
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.insertFirst(10);
        linkedList.insertFirst(20);
        linkedList.insertFirst(30);
        linkedList.insertFirst(40);
        linkedList.insertFirst(50);

        linkedList.display();
    }
}

class Link {
    Integer data;
    Link next;
    public Link(Integer data){
        this.data=data;
    }
}
