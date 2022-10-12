/*Ability to create Linked List by appending 30 and 70 to 56*/

package com.bridgelabz;

public class LinkedList {

    Node head;
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

            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }


            last.next = new_node;
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


        list = append(list, 56);
        list = append(list, 30);
        list = append(list, 70);


        printList(list);
    }
}



