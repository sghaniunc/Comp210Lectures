package Lecture10.a;

class LList implements LListInt {
    Node _head;
    Node _tail;

    LList(int value){           // constructor - creates the head node
        _head = new Node(value);
        _tail = _head;
    }

    @Override
    public Node getHead() {
        return (_head);
    }

    @Override
    public Node getTail() {
        return (_tail);
    }

    @Override
    public Node insertNode(int value) {
        Node node = new Node(value);
        _tail._nextNode = node;
        _tail = node;
        return (node);
    }

    @Override
    public boolean deleteNode(int value) {
        if (_head == null){         // case 1. Empty list
            return (false);
        }
        else {                      // case 2. Non-empty
            if (_head == _tail) {     // case 2a. 1 item
                if (_head._value == value) {
                    _head = null;
                    _tail = null;
                    return (true);
                } else {
                    return (false);
                }
            }
            else {                 // case 2b. 2+ items
                if (_head._value == value) { // case 2b.1 at head
                    _head = _head._nextNode;
                    return (true);
                } else {                      // case 2b.2. not at head
                    Node previous = _head;
                    boolean found = false;
                    while ((previous._nextNode != null) && (!found)) {
                        if (previous._nextNode._value == value) {
                            previous._nextNode = previous._nextNode._nextNode;
                            found = true;
                            return (found);
                        } else {
                            previous = previous._nextNode;
                        }
                    }
                    return (found);
                }
            }
        }
    }

    @Override
    public int search(Node node, int n, int i) {
        if (node != null) {
            if (node._value == n) {
                return (i);
            } else if (node._nextNode == null) {
                return (-1);
            } else {
                return (search(node._nextNode, n, ++i));
            }
        }
        else {
            return (-1);
        }
    }

    @Override
    public Node search(Node node, int n) {
        if (node == null){
            return (null);
        }
        else{
            if (node._value == n){
                return (node);
            } else if (node._nextNode == null) {
                return (null);
            }
            else {
                return(search(node._nextNode, n));
            }
        }
    }
}
