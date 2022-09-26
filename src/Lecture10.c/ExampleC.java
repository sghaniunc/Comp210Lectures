package Lecture10.c;

/**
 * ExampleC : Binary Search Tree example using interface LListInt
 *              with delete
 */
class Node {
    int _value;
    Node _leftChild;
    Node _rightChild;
    Node _parent;

    Node(int val){          // Constructor
        _value = val;
        _leftChild = null;
        _rightChild = null;
        _parent = null;
    }
}

public class ExampleC {
    public static void main(String[] args){
        BstList list = new BstList(10);
        list.insertNode(20);
        list.insertNode(15);

        System.out.println(list.search(list._root,10));
        System.out.println(list.search(list._root,15));
        System.out.println(list.search(list._root,18));
        System.out.println(list.search(list._root,20));

        System.out.println(list.deleteNode(list._root, 10));
        System.out.println(list.deleteNode(list._root, 15));
        System.out.println(list.deleteNode(list._root, 20));
        System.out.println(list.deleteNode(list._root, 15));
        System.out.println(list.deleteNode(list._root, 10));


    }
}

