package com.mystudy.datastructurecoding;

import java.util.Stack;

/**
 * Created by Sreesha on 4/24/2017.
 *
 *                      50
 *
 *               40            60
 *
 *          30       45    55      70
 */
public class TreeAndNode {

    public static void main(String[] args){
        Tree tree = new Tree();
        tree.insert(70);
        tree.insert(50);
        tree.insert(90);
        tree.insert(30);
        tree.insert(40);
        tree.insert(75);
        tree.insert(80);

        Node node = tree.find(50);
        if (node!=null){
            System.out.println("Node Found");
        }else {
            System.out.println("Node not found");
        }

        Node minNode = tree.findMinimum();
        System.out.println("Minimum in Node is :"+minNode.data);

        tree.displayTree();
    }
}

class Node {
    Integer data;
    Node leftChild;
    Node rightChild;
}

class Tree {
    Node root;

    public void insert(Integer data){
        Node newNode = new Node();
        newNode.data = data;

        if (root==null){
            root = newNode;
        }else{
            Node current = root;
            Node parent;
            while (true){
                parent = current;
                if(data<parent.data){
                    current=current.leftChild;
                    if (current==null){
                        parent.leftChild=newNode;
                        break;
                    }
                }else{
                    current=parent.rightChild;
                    if (current==null){
                        parent.rightChild=newNode;
                        break;
                    }
                }
            }

        }
    }

    public Node find(Integer data){
        Node current = root;
        while (current.data!=data){
            if (data<current.data){
                current=current.leftChild;
            }else{
                current=current.rightChild;
            }
        }
        if (current==null){
            return null;
        }
        return current;

    }

    public Node findMinimum() {
        Node current = root;
        while (true) {
            if (current.leftChild == null) {
                return current;
            }
            current=current.leftChild;
        }
    }

    public void displayTree()
    {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println(
                "......................................................");
        while(isRowEmpty==false)
        {
            Stack localStack = new Stack();
            isRowEmpty = true;
            for(int j=0; j<nBlanks; j++)
                System.out.print(' ');
            while(globalStack.isEmpty()==false)
            {
                Node temp = (Node)globalStack.pop();
                if(temp != null)
                {
                    System.out.print(temp.data);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);
                    if(temp.leftChild != null ||
                            temp.rightChild != null)
                        isRowEmpty = false;
                }
                else
                {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for(int j=0; j<nBlanks*2-2; j++)
                    System.out.print(' ');
            } // end while globalStack not empty
            System.out.println();
            nBlanks /= 2;
            while(localStack.isEmpty()==false)
                globalStack.push( localStack.pop() );
        } // end while isRowEmpty is false
        System.out.println(
                "......................................................");
    } // end displayTree()
}
