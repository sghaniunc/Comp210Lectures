package Lecture10.b;
/**
 * ExampleB : BST without delete
 */

class BstList implements BstInt {
    Node _root;

    BstList(int value){       // Constructor, returns root node.
        _root = new Node(value);
    }

    @Override
    public Node getRoot() {
        return (_root);
    }

    @Override
    public Node insertNode(int value) {
        Node newNode = new Node(value);
        insertNode(_root, newNode);
        return (newNode);
    }

    void insertNode(Node node, Node newNode){ //helper function. Inserts newNode starting at node
        if (node == null){                          // only for case of empty tree
            _root = node;
        }
        else {
            if (node._value < newNode._value) {     // insert on right
                if (node._rightChild == null) {
                    node._rightChild = newNode;
                } else {
                    insertNode(node._rightChild, newNode);
                }
            }
            else {                                  // insert on left
                if (node._leftChild == null) {
                    node._leftChild = newNode;
                } else {
                    insertNode(node._leftChild, newNode);
                }
            }
        }
    }

    @Override
    public boolean deleteNode(Node node, int value){      // Not implemented
        return(false);
    }


    @Override
    public Node search(Node node, int n) {
        if (node._value == n) {
            return (node);
        }
        else {
            if (node._value < n) {
                if (node._rightChild == null) {
                    return (null);
                } else {
                    return(search(node._rightChild, n));
                }
            }
            else {
                if (node._leftChild == null) {
                    return (null);
                } else {
                    return(search(node._leftChild, n));
                }
            }
        }
    }
}
