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
            System.out.print(current.data+"\t");
            current = current.next;
        }
        System.out.println(" ");
    }

    public Integer searchElement(Integer element){
        Link current = first;
        Integer position = 1;
        while(current.next!=null){
            if(current.data!=element){
                current = current.next;
                position++;
            }else {
                break;
            }
        }
        return position;
    }

    public void insertElement(Integer element,Integer position){
        Link current=first;
        Link previous= first;
        Integer count=1;
        while (current.next!=null){
            if(count==position){
                Link newLink = new Link(element);
                previous.next = newLink;
                newLink.next = current;
                break;
            }else {
                previous = current;
                current = current.next;
                count++;
            }
        }
    }

    public void deleteElementByPosition(Integer position){
        Link current = first;
        Link previous = first;
        Integer count=1;
        while (current.next!=null){
            if (count==position){
                previous.next = current.next;
                break;
            }else {
                previous =current;
                current=current.next;
                count++;
            }
        }
    }

    public void deleteElementByData(Integer element){
        Link current = first;
        Link previous = first;
        while (current.next!=null){
            if (current.data==element){
                previous.next = current.next;
                break;
            }else {
                previous =current;
                current=current.next;
            }
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

        System.out.println("Element Found in Position :"+linkedList.searchElement(40));

        linkedList.insertElement(45,3);
        linkedList.display();

        linkedList.deleteElementByPosition(4);
        linkedList.display();

        linkedList.deleteElementByData(40);
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
