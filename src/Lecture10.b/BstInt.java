package Lecture10.b;

public interface BstInt {
    Node getRoot();                             // returns the root node.
    Node insertNode(int value);                 // inserts a node in BST order and returns it.
    Node search(Node node, int n);              // search for first occurrence of int n in LL starting at node,
                                                // and returns it or null if not found.
    boolean deleteNode(Node node, int value);   // deletes value starting at node, true, or false if not found.
}
