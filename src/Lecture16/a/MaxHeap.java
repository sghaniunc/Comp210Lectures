package Lecture16.a;

import java.util.ArrayList;

public class MaxHeap<T> {
    private ArrayList<PElement<T>> _maxHeap;
    private int _size;

    public MaxHeap(){
        _maxHeap = new ArrayList<PElement<T>>();
        _size = 0;
    }

    // creates a PElement with (value, priority) and
    // enqueues it in the heap and returns its index
    public int enqueue(T value, int priority){
        PElement<T> pE = new PElement<>(value, priority);
        System.out.println("Enqueuing: "+value+", "+priority);
        _maxHeap.add(_size, pE);    //
        _size++;
        return(bubbleUp(_size-1));
    }

    // bubblesUp the child PElement at index and returns final index
    int bubbleUp(int index){
        if (index == 0) {
            return(index);
        }
        else {
            PElement<T> child = _maxHeap.get(index);
            PElement<T> parent = _maxHeap.get(parentInd(index));
            if (child._priority >=  parent._priority){
                _maxHeap.set(parentInd(index), child);
                _maxHeap.set(index, parent);
                return(bubbleUp(parentInd(index)));
            }
            else{
                return(index);
            }
        }
    }

    // removes max PElement from heap and returns the pElement
    public PElement<T> dequeue() {
        if (_size == 0) {
            return null;
        } else if (_size == 1) {
            _size--;
            return (_maxHeap.get(0));
        } else {
            PElement<T> retValue = _maxHeap.get(0);
            _maxHeap.set(0, _maxHeap.get(_size - 1));   // move last element to the top
            _size--;
            bubbleDown(0);      // bubbleDown the top element
            return (retValue);
        }
    }

    // recursively moves down element at index to satisfy heap properties
    void bubbleDown(int index){
        PElement<T> parent = _maxHeap.get(index);
        if (!hasLeftChild(index) && !hasRightChild(index)){
            return;     // is a leaf
        }
        else if (!hasRightChild(index)) {    // only has left child
            PElement<T> leftChild = _maxHeap.get(leftChildInd(index));
            if (leftChild._priority > parent._priority) {
                _maxHeap.set(index, leftChild);             // interchange
                _maxHeap.set(leftChildInd(index), parent);
                bubbleDown(leftChildInd(index)); // recurse on leftchild
            }
            else {return;}  // done
        }
        else {      // has 2 children
            PElement<T> leftChild = _maxHeap.get(leftChildInd(index));
            PElement<T> rightChild = _maxHeap.get(rightChildInd(index));
            if ((leftChild._priority > parent._priority) || (rightChild._priority > parent._priority)) {
                if (leftChild._priority > rightChild._priority) {
                    _maxHeap.set(index, leftChild);             // interchange parent & leftchild
                    _maxHeap.set(leftChildInd(index), parent);
                    bubbleDown(leftChildInd(index));            // recurse on leftchild
                } else {
                    _maxHeap.set(index, rightChild);             // interchange parent & rightchild
                    _maxHeap.set(rightChildInd(index), parent);
                    bubbleDown(rightChildInd(index));            // recurse on rightchild
                }
            }
            else {return;}  // done
        }
    }

    boolean hasLeftChild(int index){
        return(validIndex(leftChildInd(index)));}

    boolean hasRightChild(int index){
        return(validIndex(rightChildInd(index)));}

    static int leftChildInd(int index){
        return (2*index+1);}

    static int rightChildInd(int index){
        return (2*index+2);}

    static int parentInd(int index){
        return ((index-1)/2);}

    boolean validIndex(int index){
        if ((index >= 0) && (index <= _size-1)){
            return true;}
        else {return false;}}

    void printHeap(){
        System.out.println("Heap=");
        for (int i=0; i<_size; i++){
            System.out.println(i+ ": "+_maxHeap.get(i)._value+ ", "+_maxHeap.get(i)._priority);
        }
    }

}
