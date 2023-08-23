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
        else {
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            System.out.println(n.data + "This should be watched");
            node.next = n.next;
            n.next = node;
        }
    }
    public void delete(int index)
    {
        if (index == 0)
        {
            head = head.next;
        }
        else
        {
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index-1; i ++)
            {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
        }


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
    public void sumOfNodes()
    {
        int ans = 0;
        Node node = head;

        while(node.next != null)
        {
            ans += node.data;
            node = node.next;
        }
        ans += node.data;
        System.out.println(ans);
    }
    public Node middleOfLinkedList(LinkedList list)
    {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
        list.insertAt(0, 1);

        list.delete(2);
        list.show();

        list.sumOfNodes();
        Node ans = list.middleOfLinkedList(list);
        System.out.println("Middle node: " + ans.data);

    }
}