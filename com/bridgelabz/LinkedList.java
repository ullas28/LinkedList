/*Ability to create Linked List by adding 30 and 56 to 70*/

package com.bridgelabz;

public class LinkedList {


    static Node head;
    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }


    public static LinkedList append(LinkedList list, int data)
    {

        Node new_node = new Node(data);


        if (list.head == null) {
            list.head = new_node;
        }
        else {

            new_node.next = head;
            head = new_node;
        }

        return list;
    }


    public static void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        while (currNode != null) {

            System.out.print(currNode.data + " ");

            currNode = currNode.next;
        }
    }


    public static void main(String[] args)
    {

        LinkedList list = new LinkedList();


        list = append(list, 70);
        list = append(list, 30);
        list = append(list, 56);

        printList(list);
    }
}



