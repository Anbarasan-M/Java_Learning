package com.practice.collection;

class Node
{
    int data;
    Node next;
}
public class LinkedList
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

            while (n.next != null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }
    public void insertAtStart(int data)
    {
        Node node = new Node();

        node.data = data;
        node.next = head;

        head = node;

    }
    public void insertAt(int index, int data)
    {
        Node node = new Node();

        node.data = data;
        node.next = null;

        Node n = head;
        if (index == 0)
        {
            insertAtStart(data);
        }
        for (int i = 0; i < index -1; i++)
        {
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
    }
    public void show()
    {
        Node node = head;

        while (node.next != null)
        {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}
class Runner
{
    public static void main(String [] args)
    {
        LinkedList list = new LinkedList();
        list.insert(21);
        list.insert(2);
        list.insert(34);
        list.insert(98);
        list.insertAtStart(245);
        list.insertAt(3, 56);

        list.show();

    }
}
