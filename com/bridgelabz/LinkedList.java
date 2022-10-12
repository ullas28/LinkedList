/*Ability to delete the first element in the LinkedList of sequence 56->30->70 - Write pop method*/

package com.bridgelabz;

public class LinkedList<T> {

    Node<T> head, tail;
    static class Node <T>{

        T data;
        Node next;

        Node(T d)
        {
            data = d;
            next = null;
        }
    }


    public  void append(int data)
    {

        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
        }
        else {

            Node last = head;
            while (last.next != null) {
                last = last.next;
            }


            last.next = new_node;
        }

    }


    public  void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        while (currNode != null) {

            System.out.print(currNode.data + " ");


            currNode = currNode.next;
        }
    }

    public  void insert(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node<T> temp, current;
            current = head;
            temp = head.next;
            current.next = newNode;
            newNode.next = temp;
        }
    }

    public T popFirst() {
        if (head == null) {
            return null;
        } else {
            T data = head.data;
            head = head.next;
            return data;
        }
    }

    public T popLast() {
        if (head == null) {
            return null;
        } else {
            Node<T> temp = head;
            while (temp.next != tail) {
                tail = temp.next;
            }
            T data = tail.data;
            temp.next = null;
            tail = temp;
            return data;
        }
    }

    public static void main(String[] args)
    {

        LinkedList<Integer> list = new LinkedList();


        list.append(56);
        list.append(70);
        list.insert(30);
        list.printList(list);
        list.popFirst();
        list.printList(list);
        list.popLast();
        list.printList(list);

    }
}



