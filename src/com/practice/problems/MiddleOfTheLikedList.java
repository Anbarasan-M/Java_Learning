package com.practice.problems;

import java.util.AbstractList;

class Node {
    int data;
    Node next;
}
class LinkList1
{
    Node head;

    public void insert(int data)
    {
        Node node = new Node();

        node.data = data;
        node.next = null;

        if (head == null)
        {
            head = node;
        }
        else
        {
            Node n = head;
            while(n.next != null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }
}

public class MiddleOfTheLikedList
{
    public static void main(String[] args)
    {
        LinkList1 list = new LinkList1();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

    }
}
