package Lecture10.c;
/**
 * ExampleC : BST with delete
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
        if (node == null){              // only for case of empty tree
            _root = node;
        }
        else {
            if (node._value < newNode._value) {     // insert on right
                if (node._rightChild == null) {
                    node._rightChild = newNode;
                    newNode._parent = node;
                } else {
                    insertNode(node._rightChild, newNode);
                }
            }
            else {                                  // insert on left
                if (node._leftChild == null) {
                    node._leftChild = newNode;
                    newNode._parent = node;
                } else {
                    insertNode(node._leftChild, newNode);
                }
            }
        }
    }

    @Override
    public boolean deleteNode(Node node, int value){  // Deletes value starting at node, false if not found.
        Node nodeToDelete = search(node, value);
        if (nodeToDelete == null){
            return(false);
        }
        else{
            deleteGivenNode(nodeToDelete);         // helper fun. Deletes specific node.
            return (true);
        }
    }

    void deleteGivenNode(Node node) {            // helper fun. Deletes specific node
        if ((node._leftChild == null) && (node._rightChild == null)) {  // case 1. leaf
            changeChild(node, null);
        } else if ((node._leftChild == null)) {  // case 2a. node to delete only has a right child
            changeChild(node, node._rightChild);
        } else if ((node._rightChild == null)) {  // case 2b. node to delete only has a left child
            changeChild(node, node._leftChild);
        } else {   // case 3. node has 2 children. Lets use successor from right.
            Node successor = findMinNode(node._rightChild);
            successor._value = node._value;
            deleteNode(successor, successor._value);
        }
    }

    void changeChild(Node currentChild, Node newChild){    // changes parent to point at new child
        if (currentChild._parent == null) {
            _root = newChild;
            if (newChild != null) {
                newChild._parent = null;
            }
        }
        else if (currentChild._parent._leftChild == currentChild) {
            currentChild._parent._leftChild = newChild;
            if (newChild != null) {
                newChild._parent = currentChild._parent;
            }
        }
        else if (currentChild._parent._rightChild == currentChild) {
            currentChild._parent._rightChild = newChild;
            if (newChild != null) {
                newChild._parent = currentChild._parent;
            }
        }
        else {
            System.out.println("Exception error in method 'changeParent'");
        }
    }

    Node findMinNode(Node node){    // returns smallest node in tree starting at node
        if (node._leftChild == null)  {
            return (node);
        }
        else {
            return (findMinNode(node._leftChild));
        }
    }

    @Override
    public Node search(Node node, int n) {
        if (node == null){
            return (null);
        }
        else if (node._value == n) {
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
