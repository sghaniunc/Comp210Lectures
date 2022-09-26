package Lecture10.b;

/**
 * ExampleB : Binary Search Tree example using interface LListInt
 *              without delete
 */
class Node {
    int _value;
    Node _leftChild;
    Node _rightChild;

    Node(int val){          // Constructor
        _value = val;
        _leftChild = null;
        _rightChild = null;
    }
}

public class ExampleB {
    public static void main(String[] args){
        BstList list = new BstList(10);
        list.insertNode(20);
        list.insertNode(15);

        System.out.println(list.search(list._root,10));
        System.out.println(list.search(list._root,15));
        System.out.println(list.search(list._root,18));
        System.out.println(list.search(list._root,20));
    }
}

