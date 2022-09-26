package Lecture10.a;

/**
 * ExampleA : Simple Linked List example using interface LListInt
 */
class Node {
    int _value;
    Node _nextNode;

    Node(int val){          // Constructor
        _value = val;
        _nextNode = null;
    }
}

public class ExampleA {
    public static void main(String[] args){
        System.out.println("Inserting 10, 20 and 15 in Linked List");
        LList list = new LList(10);
        list.insertNode(20);
        list.insertNode(15);

        System.out.println("Searching for index of 5:" + list.search(list._head, 5, 0));
        System.out.println("Searching for index of 15:" +list.search(list._head, 15, 0));
        System.out.println("Searching for index of 10:" +list.search(list._head, 10, 0));
        System.out.println("Searching for index of 20:" +list.search(list._head, 20, 0));

        System.out.println("deleting 15:" +list.deleteNode(15));
        System.out.println("deleting 20:" +list.deleteNode(20));
        System.out.println("Searching for index of 20:" +list.search(list._head, 20, 0));
        System.out.println("deleting 10:" +list.deleteNode(10));
        System.out.println("Searching for index of 10:" +list.search(list._head, 10, 0));
        System.out.println("deleting 15:" +list.deleteNode(15));
    }
}

